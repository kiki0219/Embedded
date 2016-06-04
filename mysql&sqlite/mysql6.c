#include <mysql.h>
#include <stdio.h>
#include <stdlib.h>
#include <sys/mman.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <unistd.h>
#include <fcntl.h>
#include <string.h>
int main(int argc, char const *argv[])
{
	MYSQL * handler=NULL;
	handler=mysql_init(handler);
	if(handler==NULL)
	{
		printf("init mysql  handler fail:\n");
		exit(-1);
	}
	MYSQL * ret=mysql_real_connect(handler,"localhost","root","123456",NULL,0,NULL,0);
	if(ret==NULL)
	{
		printf("connect mysql server:%s\n",mysql_error(handler));
		exit(-1);
	}	
	mysql_query(handler,"use lkd1103db2");

	int fd=open("data.dat",O_RDWR);
	if(fd==-1)
	{
		perror("open fail\n");
		exit(-1);
	}
	char sid[10],sname[10];
	char sql[100];
	int file_size=lseek(fd,0,SEEK_END);
	char * r=(char*)mmap(NULL,file_size,PROT_READ|PROT_WRITE,MAP_PRIVATE,fd,0);
	if(r!=NULL)
	{
		close(fd);
		//printf("%s",r);
		char *p=r;
		//printf("%s",p);
		while(*p!='\0')
		{
			if(*p==',')
			{
				*p='\0';
				strcpy(sid,r);		
				r=p+1;
			}
			if(*p=='\r')
			{
				*p='\0';
				strcpy(sname,r);
				r=p+2;
                printf("%s\t%s\t%d\t%d\n",sid,sname,strlen(sid),strlen(sname));
                sprintf(sql,"insert into student values('%s','%s')",sid,sname);
                mysql_query(handler,sql);
                bzero(sid,sizeof(sid));
                bzero(sname,sizeof(sname));
			}
			p++;
		}
	}
    //munmap(r,file_size);
	mysql_close(handler);
	return 0;
}
//作业:
//1.从标准输入获取值插入到数据库的表中
//2.执行插入值时,必须考虑主键值是否重复
//3.从文件中导入多比数据到表中
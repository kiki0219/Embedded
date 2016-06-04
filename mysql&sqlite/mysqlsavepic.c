#include <mysql.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <errno.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <unistd.h>
#include <fcntl.h>
int main(int argc, char const *argv[])
{
    //图片文件操作
    int fd=open("abc.jpg",O_RDONLY);
    if(fd==-1)
    {
    	perror("open:");
    	exit(-1);
    }
    int  pic_size=lseek(fd,0,SEEK_END);
    lseek(fd,0,SEEK_SET);
    char pic_buf[pic_size+1];
    bzero(pic_buf,sizeof(pic_buf));
    int read_length=read(fd,pic_buf,sizeof(pic_buf)-1);
    //数据库操作
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
	mysql_select_db(handler,"lkd1103db2");

	//字符换码
	char  escape_buf[2*read_length+1];
	mysql_real_escape_string(handler,escape_buf,pic_buf,read_length);
    char sql[]="insert into pic values('001','%s')";
    char exe_sql[strlen(sql)+2*read_length+1];
    int l=sprintf(exe_sql,sql,escape_buf);
    if(mysql_real_query(handler,exe_sql,l))
    {
    	 printf("%s\n",mysql_error(handler));
    }  
	mysql_close(handler);
	close(fd);
	return 0;
}
/*
数据库错误修改:
mysql> show VARIABLES like 'max_allowed_packet%';
mysql> set global max_allowed_packet=20971520;
*/
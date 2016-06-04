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

	//文件操作
	int fd=open("abc1.jpg",O_CREAT|O_EXCL|O_WRONLY,0777);
	if(fd==-1)
	{
		perror("open:\n");
		exit(-1);
	}
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

	char sql[]="select picdata from pic where pid='001'";
	mysql_query(handler,sql);
    MYSQL_RES* res=mysql_store_result(handler);
    MYSQL_ROW   row=mysql_fetch_row(res);
    unsigned long * length=mysql_fetch_lengths(res);
    if(row!=NULL)
    {
      write(fd,row[0],length[0]);
    }
    close(fd);
	mysql_close(handler);
	return 0;
}
//mysql实现图片存储与读取

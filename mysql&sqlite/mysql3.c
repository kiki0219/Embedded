#include <mysql.h>
#include <stdio.h>
#include <stdlib.h>
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
	mysql_query(handler,"create database if not exists lkd1103db2");
	mysql_select_db(handler,"lkd1103db2");

	char  sid[20];
	char sname[20];
	gets(sid);
	gets(sname);
    //拼接法
    char sql[100];
    // bzero(sql,sizeof(sql));
    // strcpy(sql,"insert into student values('");
    // strcat(sql,sid);
    // strcat(sql,"','");
    // strcat(sql,sname);
    // strcat(sql,"')");

    sprintf(sql,"insert into student values('%s','%s')",sid,sname);
    mysql_query(handler,sql);
	mysql_close(handler);
	return 0;
}
//作业:
//1.从标准输入获取值插入到数据库的表中
//2.执行插入值时,必须考虑主键值是否重复
//3.从文件中导入多比数据到表中
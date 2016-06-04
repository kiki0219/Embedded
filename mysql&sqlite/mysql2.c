#include <mysql.h>
#include <stdio.h>
#include <stdlib.h>
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
	//mysql_query(handler,"use lkd1103db2");
	mysql_select_db(handler,"lkd1103db2");
	mysql_query(handler,"create table if not exists student (sid varchar(10) primary key,sname varchar(10))");
	mysql_query(handler,"insert into student values('001','student1')");
	mysql_query(handler,"insert into student values('002','student2')");
	mysql_close(handler);
	return 0;
}
//作业:
//1.从标准输入获取值插入到数据库的表中
//2.执行插入值时,必须考虑主键值是否重复
//3.从文件中导入多比数据到表中
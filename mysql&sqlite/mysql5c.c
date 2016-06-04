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
	MYSQL * ret=mysql_real_connect(handler,"localhost","root","123456","lkd1103db2",0,NULL,0);
	if(ret==NULL)
	{
		printf("connect mysql server:%s\n",mysql_error(handler));
		exit(-1);
	}
	char  sid[20];
	char sname[20];
	gets(sid);
	char sql[100];
	sprintf(sql,"select * from student where sid='%s'",sid);
	mysql_query(handler,sql);
	MYSQL_RES * res=mysql_store_result(handler);
	int rownum=mysql_num_rows(res);
	if(rownum<=0)
	{
		gets(sname);
		sprintf(sql,"insert into student values('%s','%s')",sid,sname);
		mysql_query(handler,sql);
	}
	else
	{
		printf("%s is exists\n",sid);
	}
	mysql_close(handler);
	return 0;
}
//作业:
//1.从标准输入获取值插入到数据库的表中
//2.执行插入值时,必须考虑主键值是否重复
//3.从文件中导入多比数据到表中
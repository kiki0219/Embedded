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
	mysql_query(handler,"select * from student");
	MYSQL_RES * res=mysql_store_result(handler);
	int row=mysql_num_rows(res);
	int col=mysql_num_fields(res);
	MYSQL_ROW  r=mysql_fetch_row(res);
	int i;
	MYSQL_FIELD*  f=mysql_fetch_field(res);
	while(f!=NULL)
	{
		printf("%s\t",f->name);
		f=mysql_fetch_field(res);
	}
	printf("\n");
	while(r!=NULL)
	{
		for(i=0;i<col;i++)
	    {
		   printf("%s\t",r[i]);
	    }
	    printf("\n");
	    r=mysql_fetch_row(res);
	}	
	mysql_close(handler);
	return 0;
}
//作业:
//1.从标准输入获取值插入到数据库的表中
//2.执行插入值时,必须考虑主键值是否重复
//3.从文件中导入多比数据到表中
#include <mysql.h>
#include <stdio.h>
#include <stdlib.h>
int main(int argc, char const *argv[])
{
	MYSQL * handler=NULL;
	handler=mysql_init(handler);
	if(handler==NULL)
	{
		printf("init mysql handler fail\n");
		exit(-1);
	}
	if(mysql_real_connect(handler,"localhost","root","123456","lkd1103db",0,NULL,0)==NULL)
	{
		printf("connect mysql server fail:%s\n",mysql_error(handler));
		exit(-1);
	}
	printf("connect ok\n");
	mysql_close(handler);
	return 0;
}
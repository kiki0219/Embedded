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
	mysql_select_db(handler,"lkd1103db2");
    MYSQL_STMT *st=mysql_stmt_init(handler);
    char sql[]="insert into student values(?,?)";
    mysql_stmt_prepare(st,sql,strlen(sql));
    char sid[20];
    char sname[20];
    gets(sid);
    gets(sname);
    MYSQL_BIND bind[2];
    bzero(bind,sizeof(bind));
    bind[0].buffer_type=MYSQL_TYPE_STRING;
    bind[0].buffer=sid;
    bind[0].buffer_length=strlen(sid);


    bind[1].buffer_type=MYSQL_TYPE_STRING;
    bind[1].buffer=sname;
    bind[1].buffer_length=strlen(sname);

    mysql_stmt_bind_param(st,bind);
    mysql_stmt_execute(st);
    mysql_stmt_close(st);	
	mysql_close(handler);
	return 0;
}

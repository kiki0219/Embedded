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
    char sql[]="select * from student where sid=?";
    mysql_stmt_prepare(st,sql,strlen(sql));
    char sid[20];
    char sname[20];
    char sid2[20];
    gets(sid2);
    MYSQL_BIND bind[3];
    bzero(bind,sizeof(bind));
    bind[0].buffer_type=MYSQL_TYPE_STRING;
    bind[0].buffer=sid2;
    bind[0].buffer_length=strlen(sid2);


    bind[1].buffer_type=MYSQL_TYPE_STRING;
    bind[1].buffer=sid;
    bind[1].buffer_length=sizeof(sid)-1;

    bind[2].buffer_type=MYSQL_TYPE_STRING;
    bind[2].buffer=sname;
    bind[2].buffer_length=sizeof(sid)-1;

    mysql_stmt_bind_param(st,&bind[0]);
    mysql_stmt_bind_result(st,&bind[1]);
    mysql_stmt_execute(st);
    int r=mysql_stmt_fetch(st);
    while(r==0)
    {
    	printf("%s\t%s\n",sid,sname);
    	r=mysql_stmt_fetch(st);
    }
    mysql_stmt_close(st);	
	mysql_close(handler);
	return 0;
}

#include <sqlite3.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main(int argc, char const *argv[])
{
	sqlite3 * ppDb;
	int ret=sqlite3_open("sqlitedb2",&ppDb);
	if(ret!=SQLITE_OK)
	{
		printf(sqlite3_errmsg(ppDb));
		exit(-1);
	}
    sqlite3_stmt  *st;
    sqlite3_prepare(ppDb,"insert into  student values(?,?)",-1,&st,NULL);
    char sid[10],sname[10];
    gets(sid);
    gets(sname);
    sqlite3_bind_text(st,1,sid,strlen(sid),NULL);
    sqlite3_bind_text(st,2,sname,strlen(sname),NULL);
    sqlite3_step(st);
	sqlite3_close(ppDb);
	return 0;
}

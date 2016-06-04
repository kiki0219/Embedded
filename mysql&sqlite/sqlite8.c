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
    sqlite3_prepare(ppDb,"select * from student where sid>=?",-1,&st,NULL);
    char sid[10];
    gets(sid);   
    sqlite3_bind_text(st,1,sid,strlen(sid),NULL);
    ret=sqlite3_step(st);
    while(ret==SQLITE_ROW)
    {
        printf("%s\t",sqlite3_column_text(st,0));
        printf("%s\n",sqlite3_column_text(st,1));
        ret=sqlite3_step(st);
    }
	sqlite3_close(ppDb);
	return 0;
}

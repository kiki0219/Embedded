#include <sqlite3.h>
#include <stdio.h>
#include <stdlib.h>
int main(int argc, char const *argv[])
{
	sqlite3 * ppDb;
	int ret=sqlite3_open("sqlitedb1",&ppDb);
	if(ret!=SQLITE_OK)
	{
		printf(sqlite3_errmsg(ppDb));
		exit(-1);
	}
	sqlite3_exec(ppDb,"create table class(cid text primary key,cname text)",NULL,NULL,NULL);
	sqlite3_exec(ppDb,"insert into class values('c001','class1')",NULL,NULL,NULL);
	sqlite3_exec(ppDb,"insert into class values('c002','class2')",NULL,NULL,NULL);
	sqlite3_close(ppDb);
	return 0;
}

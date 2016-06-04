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
	sqlite3_close(ppDb);
	return 0;
}
/*
[root@localhost 1103db]# gcc -I /usr/local/sqlite/include  -L  /usr/local/sqlite/lib -lsqlite3  sqlite1.c

[root@localhost include]# cp  sqlite3.h  /usr/include
[root@localhost lib]# cp  *  /usr/lib
[root@localhost 1103db]# gcc -lsqlite3  sqlite1.c
*/
#include <sqlite3.h>
#include <stdio.h>
#include <stdlib.h>
int main(int argc, char const *argv[])
{
	sqlite3 * ppDb;
	int ret=sqlite3_open("sqlitedb2",&ppDb);
	if(ret!=SQLITE_OK)
	{
		printf(sqlite3_errmsg(ppDb));
		exit(-1);
	}
    char ** result;
    int prow;
    int pcol;
	sqlite3_get_table(ppDb,"select * from student",&result,&prow,&pcol,NULL);

    int i;
    for(i=0;i<(prow+1)*pcol;i++)
    {
        printf("%s\t",*(result+i));
    }
    printf("\n");
    sqlite3_free_table(result);
	sqlite3_close(ppDb);
	return 0;
}

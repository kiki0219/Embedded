#include <sqlite3.h>
#include <stdio.h>
#include <stdlib.h>
int  outputdata(void * arg,int colnum,char** fieldvalue,char** fieldname)
{
    int i;
    for(i=0;i<colnum;i++)
    {
    	printf("%s\t",fieldname[i]);
    }
    printf("\n");
    for(i=0;i<colnum;i++)
    {
    	printf("%s\t",fieldvalue[i]);
    }
    printf("\n");
    //return 1; //1 为 假
   // return 0;//0为 真
}

int main(int argc, char const *argv[])
{
	sqlite3 * ppDb;
	int ret=sqlite3_open("sqlitedb2",&ppDb);
	if(ret!=SQLITE_OK)
	{
		printf(sqlite3_errmsg(ppDb));
		exit(-1);
	}
	sqlite3_exec(ppDb,"select * from  student",outputdata,NULL,NULL);
	sqlite3_close(ppDb);
	return 0;
}

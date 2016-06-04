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
    return 0;//0为 真
}

int main(int argc, char const *argv[])
{
	sqlite3 * ppDb;
	int ret=sqlite3_open(":memory:",&ppDb);
	//支持内存数据库(进程未结束时,可以用sql访问内存)
	if(ret!=SQLITE_OK)
	{
		printf(sqlite3_errmsg(ppDb));
		exit(-1);
	}
	sqlite3_exec(ppDb,"create table class(cid text primary key,cname text)",NULL,NULL,NULL);
	sqlite3_exec(ppDb,"insert into class values('c001','class1')",NULL,NULL,NULL);
	sqlite3_exec(ppDb,"insert into class values('c002','class2')",NULL,NULL,NULL);
	sqlite3_exec(ppDb,"select * from class",outputdata,NULL,NULL);
	sqlite3_close(ppDb);
	return 0;
}

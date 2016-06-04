#include <sqlite3.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <errno.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <unistd.h>
#include <fcntl.h>
int main(int argc, char const *argv[])
{
    int fd=open("abc1.jpg",O_CREAT|O_EXCL|O_WRONLY,0777);
    if(fd==-1)
    {
        perror("open:");
        exit(-1);
    }

	sqlite3 * ppDb;
	int ret=sqlite3_open("sqlitedb2",&ppDb);
	if(ret!=SQLITE_OK)
	{
		printf(sqlite3_errmsg(ppDb));
		exit(-1);
	}
    sqlite3_stmt  *st;
    sqlite3_prepare(ppDb,"select pic  from person where pid=?",-1,&st,NULL);
    char pid[10];
    gets(pid);   
    sqlite3_bind_text(st,1,pid,strlen(pid),NULL);
    ret=sqlite3_step(st);
    if(ret==SQLITE_ROW)
    {
        const void *buf=sqlite3_column_blob(st,0);
        int len=sqlite3_column_bytes(st,0);
        write(fd,buf,len);
    }
    close(fd);
    sqlite3_finalize(st);
	sqlite3_close(ppDb);
	return 0;
}

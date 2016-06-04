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
    int fd=open("abc.jpg",O_RDONLY);
    if(fd==-1)
    {
        perror("open:");
        exit(-1);
    }
    int f_size=lseek(fd,0,SEEK_END);
    lseek(fd,0,SEEK_SET);
    char buf[f_size+1];
    int r_len=read(fd,buf,sizeof(buf)-1);
    close(fd);

	sqlite3 * ppDb;
	int ret=sqlite3_open("sqlitedb2",&ppDb);
	if(ret!=SQLITE_OK)
	{
		printf(sqlite3_errmsg(ppDb));
		exit(-1);
	}
    sqlite3_stmt  *st;
    sqlite3_prepare(ppDb,"insert into person values(?,?)",-1,&st,NULL);
    char pid[10];
    gets(pid);   
    sqlite3_bind_text(st,1,pid,strlen(pid),NULL);
    sqlite3_bind_blob(st,2,buf,r_len,NULL);
    ret=sqlite3_step(st);
    sqlite3_finalize(st);
	sqlite3_close(ppDb);
	return 0;
}

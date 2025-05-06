#include<stdio.h>
#include<string.h>

int main()
{
	int i,j,n,t;
	scanf("%d %d",&n, &t);
	char queue[n+1],finalqueue[n+1];
	scanf("%s",queue);
	for(i=1;i<=t;i++)
	{
		strcpy(finalqueue,queue);
		for(j=n-1;j>0;j--)
		{
			if(finalqueue[j-1]=='B' && finalqueue[j]=='G') 
			{
				queue[j-1]='G';
				queue[j]='B';
			}
		}
	}
	strcpy(finalqueue,queue);
	printf("%s",finalqueue);
	return 0;
}
#include<stdio.h>
#include<string.h>

int main()
{
	int n,i,j,k=1;
	scanf("%d",&n);
	char name[n][34];
	int repeat[100000]={0};
	for(i=0;i<n;i++)
	{
		scanf("%s",name[i]);
		for(j=0;j<i;j++)
		{
			if(!strcmp(name[i],name[j])) 
			{
				printf("%s%d\n",name[i],repeat[j]+1);
				repeat[j]++;
				j++;
				break;
			}
		}
		if(strcmp(name[i],name[j-1])) printf("OK\n");
	} 
	return 0;
}
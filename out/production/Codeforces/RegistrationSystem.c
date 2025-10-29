#include<stdio.h>
#include<string.h>

int main()
{
	int n,i,j,k=0;
	scanf("%d",&n);
	char s[33],name[n][33];
	int repeat[100000]={0};
	for(i=0;i<n;i++)
	{
		scanf("%s",s);
		for(j=0;j<k;j++)
		{
			if(!strcmp(s,name[j])) 
			{
				printf("%s%d\n",s,repeat[j]+1);
				repeat[j]++;
				break;
			}
		}
		if(j==k){
			printf("OK\n");
			strcpy(name[k],s);
			k++;
			repeat[i]=0;
		} 
	} 
	return 0;
}
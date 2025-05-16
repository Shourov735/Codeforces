#include<stdio.h>

int main()
{
	int i,j,n;
	scanf("%d",&n);
	int p[n+1];
	for(i=1;i<=n;i++)
	{
		scanf("%d",&p[i]);
	} 
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			if(i==p[j])
			{
				printf("%d ",j);
				break;
			}
		}
	}
	return 0;
}
#include<stdio.h>

int main()
{
	int i,n,p,q;
	scanf("%d",&n);
	int level[n+1];
	for(i=1;i<=n;i++)
	{
		level[i]=0;
	}
	scanf("%d",&p);
	int a[p];
	for(i=0;i<p;i++)
	{
		scanf("%d",&a[i]);
		level[a[i]]=1;
	}
	scanf("%d",&q);
	int b[q];
	for(i=0;i<q;i++)
	{
		scanf("%d",&b[i]);
		level[b[i]]=1;
	}
	for(i=1;i<=n;i++)
	{
		if(level[i]!=1)
		{
			printf("Oh, my keyboard!");
			return 0;
		}
	}
	printf("I become the guy.");
	return 0;
}
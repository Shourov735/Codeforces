#include<stdio.h>

int main()
{
	int i,n,k,a=0;
	int p[51];
	scanf("%d %d",&n,&k);
	for(i=1;i<=n;i++)
	{
		scanf("%d",&p[i]);
	}
	for(i=1;i<=n;i++)
	{
		if((p[i]>=p[k])&&p[i]>0) a++;
		else break;
	}
	printf("%d",a);
	return 0;
}
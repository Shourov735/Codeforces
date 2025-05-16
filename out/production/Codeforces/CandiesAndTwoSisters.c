#include<stdio.h>

int main()
{
	int i,t;
	long long n,ways;
	scanf("%d",&t);
	for(i=0;i<t;i++)
	{
		scanf("%lld",&n);
		ways=(n-1)/2;
		printf("%lld\n",ways);
	}
	return 0;
}
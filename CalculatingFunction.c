#include<stdio.h>

int main()
{
	long long n,f;
	scanf("%lld",&n);
	if(n%2==0) f=n/2;
	else f=-1*(n+1)/2;
	printf("%lld",f);
	return 0;
}
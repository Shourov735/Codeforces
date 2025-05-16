#include<stdio.h>

int main()
{
	long long n,k,number;
	scanf("%lld %lld",&n, &k);
	if(n%2==0)
	{
		if(k<=n/2) number=2*k-1;
		else number=2*(k-n/2);
	}
	else
	{
		if(k<=(n+1)/2) number=2*k-1;
		else number=2*(k-(n+1)/2);
	}
	printf("%lld",number);
	return 0;
}
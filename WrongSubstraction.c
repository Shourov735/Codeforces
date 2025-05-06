#include<stdio.h>

int main()
{
	int i, k;
	long long n;
	scanf("%lld %d", &n, &k);
	for(i=0;i<k;i++)
	{
		if(n%10==0) n=n/10;
		else n--;
	}
	printf("%d",n);
	return 0;
}
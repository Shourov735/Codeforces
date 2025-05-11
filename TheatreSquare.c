#include<stdio.h>

int main()
{
	long long n,m,a,fn,fm;
	scanf("%lld %lld %lld",&n, &m, &a);
	fn=n/a;
	fm=m/a;
	if(n%a!=0)fn=fn+1;
	if(m%a!=0)fm=fm+1;
	/*fn=(n+a-1)/a;
	fm=(m+a-1)/a;*/
	printf("%lld",fn*fm);
	return 0;
}
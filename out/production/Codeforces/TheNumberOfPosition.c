#include<stdio.h>

int main()
{
	int n,a,b;
	scanf("%d%d%d",&n,&a,&b);
	printf("%d",n-a<b+1?n-a:b+1);
	return 0;
}
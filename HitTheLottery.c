#include<stdio.h>

int main()
{
	long n,sum=0,i=0;
	scanf("%ld",&n);
	while(sum+100<=n)
	{
		sum+=100;
		i++;
	}
	while(sum+20<=n)
	{
		sum+=20;
		i++;
	}
	while(sum+10<=n)
	{
		sum+=10;
		i++;
	}
	while(sum+5<=n)
	{
		sum+=5;
		i++;
	}
	while(sum+1<=n)
	{
		sum+=1;
		i++;
	}
	printf("%ld",i);
	return 0;
}
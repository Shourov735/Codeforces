#include<stdio.h>

int main()
{
	long int a,b,divisibility;
	int i,t;
	scanf("%d",&t);
	for(i=0;i<t;i++)
	{
		scanf("%ld %ld",&a, &b);
		if(a%b==0)
		{
			printf("%d\n",0);
			continue;
		}
		divisibility=a/b;
		printf("%ld\n",(divisibility+1)*b-a);
	}
	return 0;
}
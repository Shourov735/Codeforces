#include<stdio.h>

int main()
{
	int i,n;
	char str[2][5]={"love","hate"};
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		printf("I %s ",str[i%2]);
		if(i!=n) printf("that ");
	}
	printf("it");
	return 0;
}
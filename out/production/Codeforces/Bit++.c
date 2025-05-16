#include<stdio.h>

int main()
{
	int n,x=0;
	char str[4];
	scanf("%d",&n);
	for(int i=1;i<=n;i++)
	{
		scanf("%s",str);
		if(str[1]=='+') x++;
		else if(str[1]=='-') x--;
	}
	printf("%d",x);
	return 0;
}
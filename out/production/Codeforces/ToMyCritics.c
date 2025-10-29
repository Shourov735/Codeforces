#include<stdio.h>

int main()
{
	int t,a,b,c;
	scanf("%d",&t);
	while(t-- > 0)
	{
		scanf("%d%d%d",&a,&b,&c);
		if((a+b>=10) || (b+c>=10) || (a+c>=10)) printf("YES\n");
		else printf("NO\n");
	}
	return 0;
}
#include<stdio.h>

int main()
{
	long long int n;
	int LuckyDigit=0;
	scanf("%lld",&n);
	//printf("%lld\n",n);
	while(n)
	{
		if(n%10==4 || n%10==7)
		{
			LuckyDigit++;
		}
		n=n/10;
	}
	//printf("%d\n",LuckyDigit);
	if(LuckyDigit==0)
	{
		printf("NO");
		return 0;
	}
	while(LuckyDigit)
	{
		if(LuckyDigit%10!=4 && LuckyDigit%10!=7)
		{
			printf("NO");
			return 0;
		}
		LuckyDigit/=10;
	}
	printf("YES");
	return 0;
}
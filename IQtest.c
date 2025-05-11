#include<stdio.h>

int main()
{
	int i,j,n,even=0,odd=0;
	scanf("%d",&n);
	int num[n+1];
	for(i=1;i<=n;i++)
	{
		scanf("%d",&num[i]);
		if(num[i]%2==0) even++;
		else odd++;
	}
	if(even==n-1)
	{
		for(i=1;i<=n;i++)
		{
			if(num[i]%2!=0)
			{
				printf("%d",i);
				return 0;
			}
		}
	}
	else if(odd==n-1)
	{
		for(i=1;i<=n;i++)
		{
			if(num[i]%2==0)
			{
				printf("%d",i);
				return 0;
			}
		}
	}
	return 0;
}
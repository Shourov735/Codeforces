#include<stdio.h>

int main()
{
	int i,n,neighborSame=0;
	scanf("%d",&n);
	char stones[n+1];
	scanf("%s",stones);
	for(i=0;i<n;i++)
	{
		if(stones[i]==stones[i+1]) neighborSame++;
	}
	printf("%d",neighborSame);
	return 0;
}
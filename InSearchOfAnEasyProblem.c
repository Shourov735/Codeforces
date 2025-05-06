#include<stdio.h>

int main()
{
	int i,n,opinion;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&opinion);
		if(opinion)
		{
			printf("HARD");
			return 0;
		}
	}
	printf("EASY");
	return 0;
}
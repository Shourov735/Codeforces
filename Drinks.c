#include<stdio.h>

int main()
{
	int i,n,sum=0,juice; 
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&juice);
		sum+=juice;
	}
	printf("%f",(float)sum/n);
	return 0;
}
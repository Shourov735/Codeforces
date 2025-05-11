#include<stdio.h>

int main()
{
	int i,cost,dollar,want,need=0; 
	scanf("%d %d %d", &cost, &dollar, &want);
	for(i=1;i<=want;i++)
	{
		need=need+i*cost;
	}
	if(need<dollar)
	{
		printf("%d",0);
		return 0;
	}
	printf("%d",need-dollar);
	return 0;
}
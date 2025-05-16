#include<stdio.h>

int main()
{
	int bear,bigbro,year=0;
	scanf("%d %d",&bear, &bigbro);
	while(bear<=bigbro)
	{
		year++;
		bear=bear*3;
		bigbro=bigbro*2;
	}
	printf("%d",year);
	return 0;
}
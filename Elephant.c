#include<stdio.h>

int main()
{
	long x,steps;
	scanf("%ld",&x);
	steps=x/5;
	if(x%5!=0) steps++;
	printf("%d",steps); 
	return 0;
}
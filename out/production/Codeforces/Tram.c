#include<stdio.h>

int main()
{
	int i,n,passanger=0,maxpassanger=0;
	scanf("%d",&n);
	int exit[n],enter[n];
	for(i=0;i<n;i++)
	{
		scanf("%d %d",&exit[i], &enter[i]);
		passanger=passanger-exit[i]+enter[i];
		if(passanger>maxpassanger) maxpassanger=passanger;
	}
	printf("%d",maxpassanger);
	return 0;
}
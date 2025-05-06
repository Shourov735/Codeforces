#include<stdio.h>

int main()
{
	int i,n,group=0;
	scanf("%d",&n);
	int magnet[n];
	for(i=0;i<n;i++)
	{
		scanf("%d",&magnet[i]);
	}
	for(i=0;i<n;i++)
	{
		if((magnet[i]==10 && magnet[i+1]==01) || (magnet[i]==01 && magnet[i+1]==10)) group++;
	}
	printf("%d",group+1);
	return 0;
}
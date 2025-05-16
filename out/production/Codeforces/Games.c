#include<stdio.h>

int main()
{
	int n,i,j,answer=0;
	scanf("%d",&n);
	int h[n],a[n];
	for(i=0;i<n;i++)
	{
		scanf("%d %d",&h[i], &a[i]);
	}
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(h[i]==a[j]) answer++;
			if(h[j]==a[i]) answer++;
		}
		
	}
	printf("%d",answer);
	return 0;
}
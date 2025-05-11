#include<stdio.h>

int main()
{
	int i,j,n,nondecreasing=1,max=0;
	scanf("%d",&n);
	long a[n];
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i=i+nondecreasing)
	{
		nondecreasing=1;
		for(j=i;j<n-1;j++)
		{
			if(a[j+1]>=a[j]) nondecreasing++;
			else break;
		}
		if(nondecreasing>max) max=nondecreasing;
	}
	printf("%d",max);
	return 0;
}
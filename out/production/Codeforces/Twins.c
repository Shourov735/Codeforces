#include<stdio.h>

int main()
{
	int i,j,n,temp,totalsum=0,sum=0;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
		totalsum+=a[i];
	}	 
	// Bubble sort
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(a[j]>a[i]) 
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(i=0;i<n;i++)
	{
		sum+=a[i];
		if(sum>(totalsum-sum))
		{
			printf("%d",i+1);
			return 0;
		}
	}	 
	return 0;
}
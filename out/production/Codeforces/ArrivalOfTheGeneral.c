#include<stdio.h>

int main()
{
	int i,n,max=-50,min=200,imax,imin,move=0;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
		if(a[i]>max)
		{
			max=a[i];
			imax=i;
		} 
		if(a[i]<=min)
		{
			min=a[i];
			imin=i;
		}
	}
	move=imax+n-imin-1;
	if(imax<imin) printf("%d",move);
	else printf("%d",move-1);
	return 0;
}
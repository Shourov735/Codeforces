#include<stdio.h>

int main()
{
	int i,n,x[100],y[100],z[100];
	int xsum=0,ysum=0,zsum=0;
	scanf("%d", &n);
	for(i=0; i<n; i++)
	{
		scanf("%d %d %d", &x[i], &y[i], &z[i]);
		xsum+=x[i];
		ysum+=y[i];
		zsum+=z[i];
	} 
	if(xsum==0 && ysum==0 && zsum==0) printf("YES");
	else printf("NO");
	return 0;
}
#include<stdio.h>

int main()
{
	int k,l,m,n,d;
	scanf("%d%d%d%d%d",&k,&l,&m,&n,&d);
	if(k==1||l==1||m==1||n==1)
	{
		printf("%d",d);
		return 0;
	}
	int i,suffered[d+1],damaged=0;
	for(i=1;i<=d;i++)
	{
		suffered[i]=0;
	}
	for(i=k;i<=d;i=i+k) suffered[i]=1;
	for(i=l;i<=d;i=i+l) suffered[i]=1;
	for(i=m;i<=d;i=i+m) suffered[i]=1;
	for(i=n;i<=d;i=i+n) suffered[i]=1;

	for(i=1;i<=d;i++)
	{
		if(suffered[i]==1) damaged++;
	}
	printf("%d",damaged);
	return 0;
}
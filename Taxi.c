#include<stdio.h>

int main()
{
	int i,n,min=0,child1=0,child2=0,child3=0,child4=0,sum=0;
	scanf("%d",&n);
	int s[n]; 
	for(i=0;i<n;i++)
	{
		scanf("%d",&s[i]);
		if(s[i]==1) child1++;
		else if(s[i]==2) child2++;
		else if(s[i]==3) child3++;
		else if(s[i]==4) child4++;
	}
	min+=child4;
	if(child3>=child1)
	{
		min+=child3;
	 	child1=0;
	}
	else
	{
		min+=child3;
		child1-=child3;
	}
	sum=2*child2+child1;
	if(sum%4==0) min+=sum/4;
	else min+=sum/4+1;
	printf("%d",min);
	return 0;
}
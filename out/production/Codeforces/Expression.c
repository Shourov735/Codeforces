#include<stdio.h>

int main()
{
	int a,b,c,value[6],maximum=-10;
	scanf("%d %d %d",&a,&b,&c);
	value[0]=a+b*c;
	value[1]=a*(b+c);
	value[2]=a*b*c;
	value[3]=(a+b)*c;
	value[4]=a+b+c;
	value[5]=a*b+c;
	
	for(int i=0;i<6;i++)
	{
		if(value[i]>maximum) maximum=value[i];
	}
	printf("%d",maximum);
	return 0;
}
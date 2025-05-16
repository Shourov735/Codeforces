#include<stdio.h>

int main()
{
	int i,y,digit[4];
	scanf("%d",&y);
	for (i = y+1; ; i++)
	{
		int temp=i;
		for(int j=0;j<4;j++)
		{
			digit[j]=temp%10;
			temp=temp/10;
		}
		if((digit[0]!=digit[1]) && (digit[0]!=digit[2]) && (digit[0]!=digit[3]) && (digit[1]!=digit[2]) && (digit[1]!=digit[3]) && (digit[2]!=digit[3]))
		{
			printf("%d",i);
			break;
		}
	}
	return 0;
}
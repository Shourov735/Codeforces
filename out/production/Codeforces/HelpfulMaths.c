#include<stdio.h>

int main()
{	
	int i=0,n1=0,n2=0,n3=0;
	char s[101];
	scanf("%s",s);
	while(s[i])
	{
		if(s[i]=='3') n3++;
		if(s[i]=='2') n2++;
		if(s[i]=='1') n1++;

		i++;
	}
	while(n1)
	{
		printf("1");
		n1--;
		if(n1 || n2 || n3) printf("+");
	}
	while(n2)
	{
		printf("2");
		n2--;
		if(n1 || n2 || n3) printf("+");
	}
	while(n3)
	{
		printf("3");
		n3--;
		if(n1 || n2 || n3) printf("+");
	}
	return 0;
}
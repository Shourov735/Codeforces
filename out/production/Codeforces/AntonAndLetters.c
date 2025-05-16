#include<stdio.h>

int main()
{
	int i,letter[26]={0},total=0;
	char str[1001];
	gets(str); 
	for(i=0;str[i];i++)
	{
		if(str[i]>='a' && str[i]<='z') letter[str[i]-'a']=1;
	}
	for(i=0;i<26;i++)
	{
		total+=letter[i];
	}
	printf("%d",total);
	return 0;
}
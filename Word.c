#include<stdio.h>
#include<ctype.h>

int main()
{
	char word[101];
	int i,upper=0,lower=0;
	scanf("%s",word);
	for(i=0;word[i];i++)
	{
		if(word[i]>=97 && word[i]<=122) lower++;
		else upper++;
	}
	if(upper>lower)
	{
		for(i=0;word[i];i++)
		{
			word[i]=toupper(word[i]);
		}
	}
	else
	{
		for(i=0;word[i];i++)
		{
			word[i]=tolower(word[i]);
		}
	}
	printf("%s",word);
	return 0;
}
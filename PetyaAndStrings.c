#include<stdio.h>
#include<string.h>
#include<ctype.h>

int main()
{
	char str1[102],str2[102];
	scanf("%s",str1);
	scanf("%s",str2);
	int i=0;
	while(str1[i])
	{
		str1[i]=tolower(str1[i]);
		i++;
	}
	i=0;
	while(str2[i])
	{
		str2[i]=tolower(str2[i]);
		i++;
	}
	printf("%d",strcmp(str1,str2));
	return 0;
}
#include<stdio.h>
#include<string.h>

int main()
{
	int i,len;
	char s[101],t[101],translation[101];
	scanf("%s %s",s,t);
	len=strlen(s);
	for(i=0;i<len;i++)
	{
		translation[i]=s[len-1-i];
	}
	translation[i]='\0';
	//printf("%s %s %s\n",s,t,translation);
	if(!strcmp(translation,t)) printf("YES");
	else printf("NO");
	return 0;
}
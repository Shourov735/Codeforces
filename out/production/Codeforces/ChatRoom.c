#include<stdio.h>
#include<string.h>

int main()
{
	int i=0;
	char s[101];
	scanf("%s",s);
	while(s[0])	 
	{
		if(s[0]!='h')
		{
			i=0;
			while(s[i])	 
			{
				s[i]=s[i+1];
				i++;
			}
		}
		else break;
	}
	while(s[1])	 
	{
		if(s[1]!='e')
		{
			i=1;
			while(s[i])	 
			{
				s[i]=s[i+1];
				i++;
			}
		}
		else break;
	}	
	while(s[2])
	{
		if(s[2]!='l')
		{
			i=2;
			while(s[i])	 
			{
				s[i]=s[i+1];
				i++;
			}
		}
		else break;
	}
	while(s[3])
	{
		if(s[3]!='l')
		{
			i=3;
			while(s[i])	 
			{
				s[i]=s[i+1];
				i++;
			}
		}
		else break;
	}
	while(s[4])
	{
		if(s[4]!='o')
		{
			i=4;
			while(s[i])	 
			{
				s[i]=s[i+1];
				i++;
			}
		}
		else break;
	}
	s[5]='\0';
	//printf("%s\n",s);
	if(!strcmp(s,"hello")) printf("YES");
	else printf("NO");
	return 0;
}
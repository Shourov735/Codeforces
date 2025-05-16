#include<stdio.h>
#include<string.h>

int main()
{
	int i=0,j=0;
	char str[201]; 
	scanf("%s",str);
	while(str[0]=='W'&&str[1]=='U'&&str[2]=='B')
	{
		for(i=0;str[i];i++)
		{
			str[i]=str[i+3];
		}
	}
	i=0;
while(str[i])
{
	j=0;// Find the first occurrence of "WUB" and replace it with a space
	for( ;!(str[i]=='W'&&str[i+1]=='U'&&str[i+2]=='B')&&str[i];i++)
	{
	
	}
	while(str[i]=='W'&&str[i+1]=='U'&&str[i+2]=='B')
	{
		if(j==0)
		{
			str[i]=' ';
			j++;
			for(j=i+1;str[j];j++)
			{
				str[j]=str[j+2];
			}
			if(str[i+1]=='W'&&str[i+2]=='U'&&str[i+3]=='B') i++;
		}
		else 
		{
			for(j=i;str[j];j++)
			{
				str[j]=str[j+3];
			}
		}
	}
}	
	// Remove trailing space if it exists
	int len = strlen(str);
	if (len > 0 && str[len - 1] == ' ')
	{
		str[len - 1] = '\0';
	}
	printf("%s",str);
	return 0;
}
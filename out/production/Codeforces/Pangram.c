#include<stdio.h>

int main()
{
	int i,number,index,letter[26]={0};
	scanf("%d",&number);
	char str[number+1]; 
	scanf("%s",str);
	if(number<26)
	{
		printf("NO");
		return 0;
	}
	for(i=0;str[i];i++)
	{
		if(str[i]>='A' && str[i]<='Z') index=str[i]-'A';
		else if(str[i]>='a' && str[i]<='z') index=str[i]-'a';
		letter[index]=1;
	}
	for(i=0;i<26;i++)
	{
		if(letter[i]==0)
		{
			printf("NO");
			return 0;
		}
	}
	printf("YES");
	return 0;	
}
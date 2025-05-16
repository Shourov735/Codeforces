#include<stdio.h>
//#include<ctype.h>

int main()
{
	char word[1001];
	scanf("%s",word);
	if(word[0]>=97 && word[0]<=122) word[0]=word[0]-32;
	//word[0]=toupper(word[0]);
	printf(word);
	return 0;
}
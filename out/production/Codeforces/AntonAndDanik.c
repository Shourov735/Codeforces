#include<stdio.h>

int main()
{
	int i,n,Anton=0,Danik=0;
	scanf("%d",&n);
	char winner[n+1];
	scanf("%s",winner);
	for(i=0;winner[i];i++)
	{
		if(winner[i]=='A') Anton++;
		else Danik++;
	}
	if(Anton>Danik) printf("Anton");
	else if(Danik>Anton) printf("Danik");
	else printf("Friendship");
	return 0;
}
#include<stdio.h>

int main()
{
	int i;
	char players[101];
	scanf("%s",players);
	for(i=0;players[i+6];i++)
	{
		if(players[i]=='0' && players[i+1]=='0' && players[i+2]=='0' && players[i+3]=='0' && players[i+4]=='0' && players[i+5]=='0' && players[i+6]=='0')
		{
			printf("YES");
			return 0;
		}
		else if(players[i]=='1' && players[i+1]=='1' && players[i+2]=='1' && players[i+3]=='1' && players[i+4]=='1' && players[i+5]=='1' && players[i+6]=='1')
		{
			printf("YES");
			return 0;
		}
	}
	printf("NO");
	return 0;
}
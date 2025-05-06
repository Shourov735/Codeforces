#include<stdio.h>

int main()
{
	char p[101];
	int i;
	scanf("%s",p);
	for(i=0;p[i];i++)
	{
		if(p[i]=='H'|| p[i]=='Q'||p[i]=='9')
		{
			printf("YES");
			return 0;
		}
	}
	printf("NO");
	return 0;
}
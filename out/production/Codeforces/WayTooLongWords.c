#include<stdio.h>
#include<string.h>

int main()
{
    int n,k;
    char str[100];
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {
		scanf("%s", str);
		k=strlen(str);
		if(k>10)
		{
			printf("%c%d%c\n",str[0],k-2,str[k-1]);
		}
		else
		{
			printf("%s\n",str);
		}
    }
    return 0;
}
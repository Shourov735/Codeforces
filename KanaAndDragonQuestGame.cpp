#include<bits/c++io.h>
using namespace std;

int main()
{
	int t;
	scanf("%d",&t);
	while(t-- > 0)
	{
		int x,n,m;
		scanf("%d%d%d",&x,&n,&m);
		while(n-- > 0)
		{
			if(x<=20) break;
			x = x/2 + 10;
		}
		while(m-- > 0)
		{
			x = x - 10;
		}
		if(x<=0) printf("YES\n");
		else printf("NO\n");
	}
	return 0;
}
#include<iostream>
using namespace std;

int main()
{
	int t;
    cin >> t;
    while(t-- > 0)
	{
		int n;
		cin >> n;
		int a,b[n]={0},ans=0;
		for (int i = 0; i < n; i++)
		{
			cin >> a;
			b[a-1]++;
		}
		for (int i = 0; i < n; i++)
		{
			if(b[i]>0) ans++;
		}
		cout << ans <<"\n";
	}
	return 0;
}
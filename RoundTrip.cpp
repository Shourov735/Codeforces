#include<iostream>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(nullptr);
	int t;
	cin >> t;
	while(t-- > 0)
	{
		long r,x,d,n,rounds=0;
		string s;
		cin >> r >> x >> d >> n >> s;
		for (int i = 0; i < n; i++)
		{
			if(s[i]=='1' || (s[i]=='2' && r<x)) 
			{
				r-=d;
				rounds++;
			}
		}
		cout << rounds << "\n";
	}
	return 0;
}
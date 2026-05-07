#include<bits/stdc++.h>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(nullptr);
	
	int t;
    cin >> t;
    while(t-- > 0)
	{
		int n;
		cin >> n;
		vector<int> a(n);
		for (int i = 0; i < n; i++)
		{
			cin >> a[i];
		}
		unordered_set<int> s(a.begin(), a.end());
		int distinct=s.size(),closest=1001;
		for (int i = 0; i < n; i++)
		{
			if(a[i]>=distinct)
			{
				if(closest>a[i]) closest=a[i];
			}
		}
		cout << closest << "\n";
	}
	return 0;
}
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
		int ans = 3*(n/15);
		int mod = n%15;
		if(mod < 2) ans+=mod+1;
		for (int i = 0; i < n; i++)
		{
			if(i%3==i%5) cout << i << " ";
		}
		cout << ans << "\n";
	}
	return 0;
}
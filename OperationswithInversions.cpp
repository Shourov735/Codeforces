#include <bits/stdc++.h>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(nullptr);

	int t;
	cin >> t;
	while (t-- > 0)
	{
		int n, max = 0;
		cin >> n;
		vector<int> a(n);
		for (int i = 0; i < n; i++)
		{
			cin >> a[i];
		}
		for (int j = 0; j < n; j++)
		{
			for (int i = a.size() - 1; i > 0; i--)
			{
				if (a[i - 1] > a[i])
				{
					max++;
					a.erase(a.begin() + i);
					break;
				}
			}
		}
		cout << max << "\n";
	}
	return 0;
}
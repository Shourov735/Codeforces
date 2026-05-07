#include<bits/stdc++.h>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(nullptr);

	int t, n, x;
	cin >> t;
	while (t-- > 0)
	{
		cin >> n;
		x = 3*n;
		for (int i = 1; i <= n; i++)
		{
			cout << x-- << " " << x-- << " " << i << " ";
		}
		cout << "\n";
	}
	return 0;
}
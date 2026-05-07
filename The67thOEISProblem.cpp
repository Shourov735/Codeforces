#include<bits/stdc++.h>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(nullptr);

	int t, n;
	cin >> t;
	while (t-- > 0)
	{
		long long x = 2;
		cin >> n;
		cout << 1 << " ";
		while (n-- > 1)
		{
			// the problem here is x should be prime, not natural numbers
			cout << x * (x+1) << " " ;
			x++;
		}
		cout << "\n";
	}
	return 0;
}
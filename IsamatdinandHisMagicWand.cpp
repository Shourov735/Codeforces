#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(nullptr);
	int t;
	cin >> t;
	while (t-- > 0)
	{
		int n, odd = 0, even = 0;
		cin >> n;
		long a[n];
		for (int i = 0; i < n; i++)
		{
			cin >> a[i];
			if (a[i] % 2 == 0)
				even++;
			else
				odd++;
		}
		if (even >= 1 && odd >= 1)
		{
			sort(a, a + n);
		}
		for (int i = 0; i < n; i++)
		{
			cout << a[i] << " ";
		}
		cout << "\n";
	}
	return 0;
}
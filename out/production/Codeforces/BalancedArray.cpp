#include <iostream>
using namespace std;

int main()
{
	int t, n;
	cin >> t;
	while (t-- > 0)
	{
		cin >> n;
		n = n / 2;
		if (n % 2 != 0)
			cout << "NO" << endl;
		else
		{
			cout << "YES" << endl;
			for (int i = 1; i <= n; i++)
			{
				cout << 2 * i << " ";
			}
			for (int i = 1; i < n; i++)
			{
				cout << 2 * i - 1 << " ";
			}
			cout << 2 * n - 1 + n << endl;
		}
	}
	return 0;
}
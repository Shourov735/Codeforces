#include <iostream>
using namespace std;

int main()
{
	int t;
	cin >> t;
	while (t-- > 0)
	{
		int n;
		cin >> n;
		int a[n], longest = 0, zero = 0;
		for (int i = 0; i < n; i++)
		{
			cin >> a[i];
			if (a[i] == 0)	zero++;
			else
			{
				longest = zero > longest ? zero : longest;
				zero = 0;
			}
			longest = zero > longest ? zero : longest;

		}
		cout << longest << endl;
	}
	return 0;
}
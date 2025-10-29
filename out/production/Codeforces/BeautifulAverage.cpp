#include <iostream>
using namespace std;

int main()
{
	int t;
	cin >> t;
	while (t-- > 0)
	{
		int n, a, max = 0;
		cin >> n;
		while (n-- > 0)
		{
			cin >> a;
			if (a > max) max = a;
		}
		cout << max << "\n";
	}
	return 0;
}
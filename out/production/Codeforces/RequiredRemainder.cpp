#include <iostream>
using namespace std;

int main()
{
	int t;
	cin >> t;
	while (t-- > 0)
	{
		int x, y, n, k;
		cin >> x >> y >> n;
		k = (n - y) / x * x + y;
		cout << k << endl;
	}
	return 0;
}
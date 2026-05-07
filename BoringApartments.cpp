#include <iostream>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(nullptr);
	int t, x;
	cin >> t;
	while (t-- > 0)
	{
		cin >> x;
		if (x % 1111 == 0) x = 10 * x/1111;
		else if (x % 111 == 0) x = 10 * x/111 -4;
		else if (x % 11 == 0) x = 10 * x/11 -7;
		else x = 10 * x -9;
		cout << x << "\n";
	}
	return 0;
}
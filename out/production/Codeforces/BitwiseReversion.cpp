#include <iostream>
#include <string>
using namespace std;

int main()
{
	int t;
	cin >> t;
	long long x, y, z;
	while (t-- > 0)
	{
		cin >> x >> y >> z;
		if (x & y & z)
			cout << "YES" << endl;
		else
			cout << "NO" << endl;
	}
	return 0;
}
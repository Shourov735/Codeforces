#include <iostream>
using namespace std;

int main()
{
	int t;
	cin >> t;
	while (t-- > 0)
	{
		int n, k;
		cin >> n >> k;
		int a[n];
		string s = "NO";
		for (int i = 0; i < n; i++)
		{
			cin >> a[i];
			if (a[i] == k)
			{
				s = "YES";
				//break;   it creates problem
			}
		}
		cout << s << endl;
	}
	return 0;
}
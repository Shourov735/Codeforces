#include <iostream>
#include <string>
using namespace std;

int main()
{
	int t, n;
	cin >> t;
	string s;
	while (t-- > 0)
	{
		cin >> n >> s;
		if (n == 5)
		{
			int a[57] = {0};
			for (int i = 0; i < n; i++) a[s[i] - 'A']++;
			// Check if input is permutation of"Timur"
			if(a[19]==1 && a[40]==1 && a[44]==1 && a[52]==1 && a[49]==1) cout << "YES\n";
			else cout << "NO\n";
		}
		else
			cout << "NO\n";
	}
	return 0;
}
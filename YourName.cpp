#include <iostream>
#include <string>
using namespace std;

int main()
{
	int t, n;
	cin >> t;
	string s1, s2;
	while (t-- > 0)
	{
		cin >> n >> s1 >> s2;
		int a[26] = {0}, b[26] = {0};
		string s = "YES\n";
		for (int i = 0; i < n; i++)
		{
			a[s1[i] - 'a']++;
			b[s2[i] - 'a']++;
		}
		for (int i = 0; i < 26; i++)
		{
			if (a[i] != b[i])
				s = "NO\n";
		}
		cout << s;
	}
	return 0;
}
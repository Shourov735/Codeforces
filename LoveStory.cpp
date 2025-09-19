#include <iostream>
using namespace std;

int main()
{
	int t;
	cin >> t;
	string s, c = "codeforces";
	while (t-- > 0)
	{
		int differs = 0;
		cin >> s;
		for (int i = 0; i < 10; i++)
		{
			if (s[i] != c[i])
				differs++;
		}
		cout << differs << endl;
	}
	return 0;
}
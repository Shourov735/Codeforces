#include <iostream>
#include <string>
using namespace std;

int main()
{
	int t;
	cin >> t;
	string s;
	while (t-- > 0)
	{
		cin >> s;
		int n = s.length();
		string r;
		r += s[0];
		for (int i = 1; i < n - 1; i += 2)
			r += s[i];
		r += s[n - 1];
		cout << r << endl;
	}
	return 0;
}
#include<iostream>
#include<string>
using namespace std;

int main()
{
	int a[4];
	for (int i = 0; i < 4; i++) cin >> a[i];
	string s;
	cin >> s;
	int calorie = 0, n = s.length();
	for (int i = 0; i < n; i++)
	{
		calorie += a[s[i]-48-1];
	}
	cout << calorie << endl;
	return 0;
}
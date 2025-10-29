#include <iostream>
#include <string>
#include <map>
using namespace std;

int main()
{
	int n;
	string s;
	cin >> n;
	map<string, int> map;
	for (int i = 0; i < n; i++)
	{
		cin >> s;
		if (map[s] == 0)
		{
			cout << "OK\n";
			map[s]++;
		}
		else
		{
			cout << s << map[s] << "\n";
			map[s]++;
		}
	}
	return 0;
}
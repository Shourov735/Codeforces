#include<iostream>
#include<string>
using namespace std;

int main()
{
	int t, n;
    cin >> t;
	string s;
    while(t-- > 0)
	{
		cin >> n >> s;
		int a[26]={0}, balloon=0;
		for (int i = 0; i < n; i++)
		{
			if(a[s[i]-'A'] == 0) a[s[i]-'A']+=2;
			else a[s[i]-'A']++;
		}
		for (int i = 0; i < 26; i++) balloon+=a[i];
		cout << balloon << "\n";
	}
	return 0;
}
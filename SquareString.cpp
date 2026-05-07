#include<iostream>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(nullptr);
	int t;
	string s;
	cin >> t;
	while(t-- > 0)
	{
		cin >> s;
		int n=s.length();
		if(n%2==1) cout << "NO\n";
		else if(s.substr(0,n/2)==s.substr(n/2,n/2)) cout << "YES\n";
		else cout << "NO\n";
	}
	return 0;
}
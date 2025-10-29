#include<iostream>
using namespace std;

int main()
{
	int a,b,c,d;
	int t;
    cin >> t;
    while(t-- > 0)
	{
		cin >> a >> b >>c >> d;
		if(a==b && b==c && c==d) cout << "YES\n";
		else cout << "NO\n";
	}
	return 0;
}
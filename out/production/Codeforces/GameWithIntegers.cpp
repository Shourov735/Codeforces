#include<iostream>
using namespace std;

int main()
{
	int t, n;
    cin >> t;
    while(t-- > 0)
	{
		cin >> n;
		if(n%3 == 0) cout << "Second\n";
		else cout << "First\n";
	}
	return 0;
}
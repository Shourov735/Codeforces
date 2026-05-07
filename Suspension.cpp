#include<iostream>
using namespace std;

int main()
{
	int t;
    cin >> t;
    while(t-- > 0)
	{
		int n,y,r;
		cin >> n >> y >> r;
		cout << min(n, r+y/2) << "\n";
	}
	return 0;
}
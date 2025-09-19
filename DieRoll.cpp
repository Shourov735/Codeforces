#include <iostream>
using namespace std;

int main()
{
	int y, k;
	cin >> y >> k;
	int a = 7 - (y > k ? y : k);
	if(a==6) cout << "1/1";
	else if(a==5) cout << "5/6";
	else if(a==4) cout << "2/3";
	else if(a==3) cout << "1/2";
	else if(a==2) cout << "1/3";
	else cout << "1/6";
	return 0;
}
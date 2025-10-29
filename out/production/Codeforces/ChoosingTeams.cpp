#include<iostream>
using namespace std;

int main()
{
	int n, k, c = 0;
	cin >> n >> k;
	int y[n];
	for (int i = 0; i < n; i++)
	{
		cin >> y[i];
		if(y[i]+k <= 5) c++;
	}
	cout << c/3 << endl;
	return 0;
}
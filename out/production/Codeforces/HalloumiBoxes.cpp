#include<iostream>
using namespace std;

bool is_sorted(const long a[],int n)
{
	for (int i = 1; i < n; i++)
	{
		if (a[i-1]>a[i]) return false;
	}
	return true;
}
int main()
{
	int t;
    cin >> t;
    while(t-- > 0)
	{
		int n, k;
		cin >> n >> k;
		long a[n];
		for (int i = 0; i < n; i++)
		{
			cin >> a[i];
		}
		cout << (k > 1 ? "YES\n" : (is_sorted(a , n) ? "YES\n" : "NO\n")) ;

	}
	return 0;
}
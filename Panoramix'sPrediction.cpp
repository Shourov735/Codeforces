#include<iostream>
using namespace std;

bool isPrime(int n)
{
	if(n<2) return false;
	for (int i = 2; i*i <= n; i++)
	{
		if(n%i==0) return false;
	}
	return true;
}
int main()
{
	int n, m;
	cin >> n >> m ;
	if(!isPrime(m))
	{
		cout << "NO" << endl;
		return 0;
	}
	for (int i = n+1; i < m; i++)
	{
		if(isPrime(i))
		{
			cout << "NO" << endl;
			return 0;
		}
	}
	cout << "YES" << endl;
	return 0;
}
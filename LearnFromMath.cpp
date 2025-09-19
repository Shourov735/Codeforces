#include<iostream>
using namespace std;

bool isPrime(int n)
{
	if (n < 2) return false;
	for (int i = 2; i * i <= n; i++)
	{
		if (n % i == 0) return false;
	}
	return true;
}
int main()
{
	int n, x = 4;
	cin >> n;
	while(isPrime(n-x))
	{
		x += 2;
	}
	cout << x << " " << n-x << endl;
	return 0;

}
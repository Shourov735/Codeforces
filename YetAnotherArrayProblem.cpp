#include <iostream>
using namespace std;
int isPrime[1000007];
void sieve(){
	isPrime[0]=0;
	isPrime[1]=0;
	for (int i = 2; i < 1000007; i++)
	{
		isPrime[i]=1;
	}
	for (int i = 2; i < 1000007; i++)
	{
		if(isPrime[i]){
			for (int j = 2*i; j < 1000007; j+=i)
			{
				isPrime[j]=0;
			}
		}
	}
}
int main()
{
	ios::sync_with_stdio(false);
	cin.tie(nullptr);
	int t;
	cin >> t;
	while (t-- > 0)
	{
		int n;
		cin >> n;
		long long a[n],x=2;
		for (int i = 0; i < n; i++)
		{
			cin >> a[i];
			
		}
		
	}
	return 0;
}
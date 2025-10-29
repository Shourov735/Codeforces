#include<bits/stdc++.h>
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
	sieve();
	int n;
	cin >> n;
	long long arr[n];
	for (int i = 0; i < n; i++)
	{
		cin >> arr[i];
	}
	for (int i = 0; i < n; i++)
	{
		long long x = sqrt(arr[i]);
		if((x*x)==arr[i] && isPrime[x]){
			cout << "YES\n";
		}
		else cout << "NO\n";
	}
	
	return 0;
}
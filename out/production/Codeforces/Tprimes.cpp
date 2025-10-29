#include<iostream>
#include<cmath>
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
    int t;
    long long x;
    cin >> t;
    while(t-- > 0)
    {
        cin >> x;
        long long root = sqrt(x);
        if (root * root == x && isPrime[root]) cout << "YES" << "\n";
        else cout << "NO" << "\n";
    }
    return 0;
}

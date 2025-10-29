#include<iostream>
using namespace std;

int main()
{
	int t;
    cin >> t;
    while(t-- > 0)
	{
		int n;
		cin >> n;
		int a,odd=0,move=0;
		for (int i = 0; i < n; i++)
		{
			cin >> a;
			if(a%2!=0) odd++;
			if(i%2!=a%2) move++;
		}
		int even=n-odd,indxEven= n%2==0 ? n/2 : n/2+1,indxOdd=n/2; 
		if(even==indxEven && odd == indxOdd)
			cout << move/2 << endl;
		else
			cout << -1 << '\n';

	}
	return 0;
}
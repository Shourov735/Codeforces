#include<iostream>
#include<string>
using namespace std;

int main()
{
	int t;
    cin >> t;
    while(t-- > 0)
	{
		int n, i;
		cin >> n;
		string s;
		cin >> s;
		for (i = 0;((s[i]-48==0 && s[n-1-i]-48==1) || (s[i]-48==1 && s[n-1-i]-48==0)) && (n-1-i)>=n/2; i++);
		cout << n-2*i << endl;
		
	}
	return 0;
}
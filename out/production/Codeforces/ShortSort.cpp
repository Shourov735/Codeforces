#include<iostream>
#include<string>
using namespace std;

int main()
{
	int t;
    cin >> t;
	string s;
    while(t-- > 0)
	{
		cin >> s;
		if(s=="abc"||s=="acb"||s=="bac"||s=="cba") cout<<"Yes"<<endl;
		else cout<<"No"<<endl;
	}
	return 0;
}
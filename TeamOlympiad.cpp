#include<iostream>
using namespace std;

int main()
{
	int n;
	cin >> n;
	int t[n+1];
	int one[n],two[n],three[n];
	int p, q ,r ,min ;
	p=q=r=0;
	for (int i = 1; i <= n; i++)
	{
		cin >> t[i];
		if(t[i]==1) one[p++]=i;
		if(t[i]==2) two[q++]=i;
		if(t[i]==3) three[r++]=i;
	}
	if(p<q && p<r) min=p;
	else if(q<r && q<r) min = q;
	else min = r;
	cout << min << endl;
	for(int j = 0; j < min ; j++)
	{
		cout << one[j] << " " << two[j] << " " << three[j] << endl;
	}
	return 0;
}
#include<bits/stdc++.h>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(nullptr);
	int t,a[7];
	cin >> t;
	while (t-- > 0)
	{
		int max = -1000;
		for (int i = 0; i < 7; i++){
			cin >> a[i];
			if(a[i]> max) max = a[i];
		}
		cout << 2*max-a[0]-a[1]-a[2]-a[3]-a[4]-a[5]-a[6] << "\n";
	}
	return 0;
}
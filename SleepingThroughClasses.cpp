#include<bits/stdc++.h>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(nullptr);

	int t, n, k;
	cin >> t;
	string s;
	while (t-- > 0)
	{
		cin >> n >> k >> s;
		int sleep=0;
		for (int i = 0; i < s.size(); i++)
		{
			if(s[i]=='0') sleep++;
			else 
			{
				int have = 0;
				for (int j = i+k; j > i && j < n; j--)
				{
					if(s[j]=='1')
					{
						i=j-1;
						have = 1;
						break;
					}
				}
				if(have!=1) i+=k;
				
			}
		}
		cout << sleep << "\n";
	}
	return 0;
}
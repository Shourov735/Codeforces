#include <iostream>
#include<algorithm>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(nullptr);
	int n, a[3], ans=0;
	cin >> n >> a[0] >> a[1] >> a[2];
	sort(a,a+3);
	// AI
	for (int i = 0; i <= n/a[2]; i++)
	{
		for (int j = 0; j <= (n - i * a[2]) / a[1]; j++)
		{
			if ((n - i * a[2] - j * a[1]) % a[0] == 0)
			{
				ans = max(ans, i + j + (n - i * a[2] - j * a[1]) / a[0]);
			}
		}		
	}
	
	cout << ans << "\n";
	return 0;
}
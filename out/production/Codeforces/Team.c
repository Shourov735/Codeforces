#include <stdio.h>
int main()
{
	int i, n, x, y, z, result = 0;
	scanf("%d", &n);
	for (i = 1; i <= n; i++)
	{
		scanf("%d", &x);
		scanf("%d", &y);
		scanf("%d", &z);
		if ((x + y + z) >= 2)
			result = result + 1;
	}
	printf("%d", result);
	return 0;
}
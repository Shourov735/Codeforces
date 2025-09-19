#include <iostream>
using namespace std;

int main()
{
	int n, m, c, win = 0, lose = 0;
	cin >> n;
	for (int i = 0; i < n; i++)
	{
		cin >> m >> c;
		if (m > c)
			win++;
		else if (m < c)
			lose++;
	}
	if (win == lose)
		cout << "Friendship is magic!^^" << endl;
	else if (win > lose)
		cout << "Mishka" << endl;
	else
		cout << "Chris" << endl;
	return 0;
}
#include <iostream>
using namespace std;

int main()
{
    int t;
    char c;
    cin >> t;
    while (t-- > 0)
    {
        int point = 0;
        for (int i = 1; i < 11; i++)
        {
            for (int j = 1; j < 11; j++)
            {
                cin >> c;
                if (c == 'X')
                {
                    if (i == 1 || i == 10 || j == 1 || j == 10) point += 1;
                    else if (i == 2 || i == 9 || j == 2 || j == 9) point += 2;
                    else if (i == 3 || i == 8 || j == 3 || j == 8) point += 3;
                    else if (i == 4 || i == 7 || j == 4 || j == 7) point += 4;
                    else if (i == 5 || i == 6 || j == 5 || j == 6) point += 5;
                }
            }
        }
        cout << point << '\n';
    }
    return 0;
}
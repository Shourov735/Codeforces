#include <bits/stdc++.h>
using namespace std;

// Your solution (the buggy one)
int your_solve(int n, int k, string s) {
    int sleep=0;
    for (int i = 0; i < s.size(); i++) {
        if(s[i]=='0') sleep++;
        else {
            int have = 0;
            for (int j = i+k; j > i; j--) {
                if (j < n && s[j]=='1') {
                    i = j-1;
                    have = 1;
                    break;
                }
            }
            if(have!=1) i+=k;
        }
    }
    return sleep;
}

// Correct brute-force solution
int correct_solve(int n, int k, string s) {
    vector<int> awake(n, 0);
    for (int i = 0; i < n; i++) {
        if (s[i] == '1') {
            int r = min(n-1, i+k);
            for (int j = i; j <= r; j++)
                awake[j] = 1;
        }
    }

    int sleep = 0;
    for (int i = 0; i < n; i++)
        if (s[i] == '0' && awake[i] == 0)
            sleep++;

    return sleep;
}

int main() {
    // Check all strings of length <= 12
    for (int n = 1; n <= 12; n++) {
        int total = 1 << n;

        for (int mask = 0; mask < total; mask++) {
            string s;
            for (int i = 0; i < n; i++)
                s.push_back( (mask & (1 << i)) ? '1' : '0' );

            for (int k = 0; k <= n; k++) {
                int a = your_solve(n, k, s);
                int b = correct_solve(n, k, s);
                if (a != b) {
                    cout << "Mismatch found!\n";
                    cout << "n=" << n << " k=" << k << "\n";
                    cout << "s=" << s << "\n";
                    cout << "your_solve = " << a << "\n";
                    cout << "correct    = " << b << "\n";
                    return 0;
                }
            }
        }
    }

    cout << "No mismatches found up to n=12.\n";
    return 0;
}

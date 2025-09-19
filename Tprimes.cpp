#include<iostream>
#include<cmath>
using namespace std;

bool is_prime(long long n) {
    if (n < 2) return false;
    for (long long i = 2; i * i <= n; i++) {
        if (n % i == 0) return false;
    }
    return true;
}

int main()
{
    int t;
    cin >> t;
    while(t-- > 0)
    {
        long long x;
        cin >> x;
        long long root = (long long)sqrt(x);
        if (root * root == x && is_prime(root)) cout << "YES" << endl;
        else cout << "NO" << endl;
    }
    return 0;
}
/* AI
#include<iostream>
#include<cmath>
#include<vector>
using namespace std;

const int MAX = 1000001;
vector<bool> is_prime(MAX, true);

void sieve() {
    is_prime[0] = is_prime[1] = false;
    for (int i = 2; i * i <= MAX; i++) {
        if (is_prime[i]) {
            for (int j = i * i; j <= MAX; j += i) {
                is_prime[j] = false;
            }
        }
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    sieve();  // precompute primes
    
    int n;
    cin >> n;
    while(n--) {
        long long x;
        cin >> x;
        long long root = sqrt(x);
        if (root * root == x && root <= 1000000 && is_prime[root])
            cout << "YES\n";
        else
            cout << "NO\n";
    }
    return 0;
}*/
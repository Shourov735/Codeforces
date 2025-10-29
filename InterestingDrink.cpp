#include <bits/stdc++.h>
using namespace std;

// returns number of elements <= target in the first n elements of arr
int count_leq(const vector<int>& arr, int n, long long target) {
    int l = 0, r = n; // invariant: answer in [l, r]
    while (l < r) {
        int mid = l + (r - l) / 2;
        if (arr[mid] <= target) l = mid + 1;
        else r = mid;
    }
    return l;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    if (!(cin >> n)) return 0;

    vector<int> prices(n);
    for (int i = 0; i < n; ++i) cin >> prices[i];

    sort(prices.begin(), prices.end());

    int q; cin >> q;
    while (q--) {
        long long m; cin >> m;
        cout << count_leq(prices, n, m) << '\n';
    }
    return 0;
}

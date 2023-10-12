#include <bits/stdc++.h>
using namespace std;

int main() {
    int t, l, v1, v2;
    
    cin >> t;
    cin >> l >> v1 >> v2;

    for (int i = 1; i <= t; i++) {
        double ans = (double) l / (v1 + v2);
        cout << fixed << setprecision(10) << ans << endl;
    }
}
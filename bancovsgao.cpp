#include <iostream>

using namespace std;

int main() {
    int n, q;
    cin>>n>>q;
    long long tongsogao = 0;
    long long gao = 1;

    for (int i = 0; i < n; i++) {
        tongsogao += gao;
        gao *= q;
    }

    cout  << tongsogao;

    return 0;
}

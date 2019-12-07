/*
A code to find whether the given number is power of 2 or not in O(1).
*/
#include <iostream>
using namespace std;
int main()
{
    int x;
    printf("Enter a number: ");
    cin >> x;
    cout << "Is the number power of 2?" << (x && (!(x & (x - 1))));
    return 0;
}

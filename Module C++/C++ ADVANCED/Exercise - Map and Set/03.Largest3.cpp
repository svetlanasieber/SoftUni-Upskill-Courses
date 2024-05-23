#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    vector<double> numbers;
    double number;

    // Read input numbers
    while (cin >> number) {
        numbers.push_back(number);
    }

    // Sort the numbers in descending order
    sort(numbers.rbegin(), numbers.rend());

    // Print the largest 3 numbers or all if there are fewer than 3
    int count = min(3, (int)numbers.size());
    for (int i = 0; i < count; i++) {
        cout << numbers[i] << " ";
    }

    cout << endl;
    return 0;
}


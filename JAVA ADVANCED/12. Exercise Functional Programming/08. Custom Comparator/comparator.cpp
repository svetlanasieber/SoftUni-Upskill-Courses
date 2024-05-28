#include <iostream>
#include <vector>
#include <algorithm>

// Custom comparator function
bool customComparator(int a, int b) {
    // If both numbers are either even or odd, sort in ascending order
    if ((a % 2 == 0) == (b % 2 == 0)) {
        return a < b;
    }
    // If a is even and b is odd, a should come first
    return a % 2 == 0;
}

int main() {
    std::vector<int> numbers = {1, 2, 3, 4, 5, 6}; // Example input

    // Sort the numbers using the custom comparator
    std::sort(numbers.begin(), numbers.end(), customComparator);

    // Print the sorted numbers
    for (const int& number : numbers) {
        std::cout << number << " ";
    }

    return 0;
}

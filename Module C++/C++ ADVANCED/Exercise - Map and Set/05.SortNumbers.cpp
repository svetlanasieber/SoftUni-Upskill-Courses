#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    vector<double> numbers;
    double number;

    // Четене на входни числа
    while (cin >> number) {
        numbers.push_back(number);
    }

    // Сортиране на числата в нарастващ ред
    sort(numbers.begin(), numbers.end());

    // Отпечатване на числата във формат `<=`
    for (size_t i = 0; i < numbers.size(); ++i) {
        if (i > 0) {
            cout << " <= ";
        }
        cout << numbers[i];
    }
    cout << endl;

    return 0;
}


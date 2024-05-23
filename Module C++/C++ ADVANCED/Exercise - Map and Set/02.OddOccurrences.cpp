#include <iostream>
#include <string>
#include <map>
#include <sstream>
#include <vector>
#include <algorithm>
#include <cctype>

using namespace std;

// Function to convert a string to lowercase
string toLowerCase(const string& str) {
    string lowerStr;
    for (char c : str) {
        lowerStr += tolower(c);
    }
    return lowerStr;
}

int main() {
    map<string, int> wordCounts;
    vector<string> wordsInOrder;

    string line;
    getline(cin, line);

    istringstream istr(line);
    string word;

    // Read words and count their occurrences
    while (istr >> word) {
        string lowerWord = toLowerCase(word);
        if (wordCounts.find(lowerWord) == wordCounts.end()) {
            wordsInOrder.push_back(lowerWord);
        }
        wordCounts[lowerWord]++;
    }

    // Print words that appear an odd number of times with commas
    bool first = true;
    for (const string& w : wordsInOrder) {
        if (wordCounts[w] % 2 != 0) {
            if (!first) {
                cout << ", ";
            }
            cout << w;
            first = false;
        }
    }
    cout << endl;

    return 0;
}

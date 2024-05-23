#include <iostream>
#include <string>
#include <set>
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
    string line;
    getline(cin, line);  // Read the entire input line

    istringstream istr(line);
    set<string> uniqueWords;  // Set to store unique words
    vector<string> shortWords;  // Vector to store short words

    string word;
    while (istr >> word) {
        string lowerWord = toLowerCase(word);
        if (lowerWord.length() < 5) {
            uniqueWords.insert(lowerWord);
        }
    }

    // Copy unique words to a vector
    shortWords.assign(uniqueWords.begin(), uniqueWords.end());

    // Sort the vector alphabetically
    sort(shortWords.begin(), shortWords.end());

    // Print the words separated by a comma and a space
    for (size_t i = 0; i < shortWords.size(); i++) {
        if (i > 0) {
            cout << ", ";
        }
        cout << shortWords[i];
    }
    cout << endl;

    return 0;
}

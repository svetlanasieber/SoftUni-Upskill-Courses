#include <iostream>
#include <sstream>
#include <string>
#include <vector>
#include <stack>

using namespace std;

vector<string> readInput() {
    vector<string> words;

    string input;
    getline(cin, input);

    istringstream inputStream(input);

    string word; 
    while (inputStream >> word) {
        words.push_back(word);
    }

    return words;
}

void printReversedWords(vector<string>& words) {
    stack<string> reversed;

    for (const string& word : words)
        reversed.push(word);

    while (!reversed.empty()) {
        cout << reversed.top() << " ";
        reversed.pop();
    }
    
}

int main()
{
    vector<string> words = readInput();

    printReversedWords(words);

    cout << endl;

    return 0;
}

#include <iostream>
#include <vector>
#include <string>
#include <sstream>

using namespace std;


vector<string> read_vector() {
    string line;
    getline(cin, line);
    stringstream ss(line);
    vector<string> result;
    string number;
    while (ss >> number) {
        result.push_back(number);
    }
    return result;
}


string compare_vectors(const vector<string>& vec1, const vector<string>& vec2) {
    string result;
    size_t i = 0, j = 0;

    
    while (i < vec1.size() && j < vec2.size()) {
        if (vec1[i].length() == vec2[j].length()) {
            if (vec1[i] == vec2[j]) {
                result += '=';
            }
            else if (vec1[i] > vec2[j]) {
                result += '<';
            }
            else {
                result += '>';
            }
        }
        else {
            // tuk length
            result += (vec1[i].length() > vec2[j].length()) ? '<' : '>';
        }
        ++i;
        ++j;
    }

    // edno
    while (i < vec1.size()) {
        result += '+';
        ++i;
    }

    // dve
    while (j < vec2.size()) {
        result += '-';
        ++j;
    }

    return result;
}

int main() {
    
    vector<string> vector1 = read_vector();
    vector<string> vector2 = read_vector();

    
    string comparison_result = compare_vectors(vector1, vector2);

    // Krai
    cout << comparison_result << endl;

    return 0;
}

#include <iostream>
#include <string>
#include <map>
#include <cctype>
#include <algorithm>

using namespace std;

int main() {
    map<string, int> resources;
    map<string, string> originalResources;
    string input;
    string resource;
    int quantity;

    while (true) {
        // Четене на име на ресурс
        getline(cin, input);
        if (input == "stop") {
            break;
        }
        resource = input;

        // Четене на количество
        getline(cin, input);
        if (input == "stop") {
            break;
        }
        quantity = stoi(input);

        // Преобразуване на името на ресурса в малки букви за нормализиране
        string resourceLower = resource;
        transform(resourceLower.begin(), resourceLower.end(), resourceLower.begin(), ::tolower);

        // Добавяне или увеличаване на количеството на ресурса в map
        resources[resourceLower] += quantity;
        // Запазване на оригиналното име на ресурса
        originalResources[resourceLower] = resource;
    }

    // Отпечатване на резултата
    for (const auto& pair : resources) {
        cout << originalResources[pair.first] << " -> " << pair.second << endl;
    }

    return 0;
}

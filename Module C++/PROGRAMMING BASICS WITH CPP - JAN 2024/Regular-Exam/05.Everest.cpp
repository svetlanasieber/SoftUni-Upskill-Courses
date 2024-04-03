#include <iostream>
#include <string>

int main() {
    int baseCampAltitude = 5364;
    int peakAltitude = 8848;
    int currentAltitude = baseCampAltitude;
    int days = 1;
    std::string input;
    bool goalReached = false;

    while (days <= 5 && currentAltitude < peakAltitude) {
       
        std::getline(std::cin, input);
        if (input == "END") {
            break;
        }

        if (input == "Yes") {
            ++days;
        }

        
        int climbedMeters;
        std::cin >> climbedMeters;
        std::cin.ignore(); // To ignore the newline character after entering climbed meters

        currentAltitude += climbedMeters;

        if (currentAltitude >= peakAltitude) {
            goalReached = true;
            break;
        }
    }

    if (goalReached) {
        std::cout << "Goal reached for " << days << " days!\n";
    }
    else {
        std::cout << "Failed!\n";
        std::cout << currentAltitude << std::endl;
    }

    return 0;
}

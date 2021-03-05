#include <iostream>

using namespace std;

int main() {
    int number;

    cout << "Enter a number: ";
    cin >> number;
    
    if (number < 100) 
        cout << "Too small.";
    else
        cout << "This number is big enough.";
}
#include <iostream>
#include <fstream>

using namespace std;

int main() {
    ofstream output_file;
    string fname = "example.txt";
    output_file.open(fname);
    // bad() function will check for badbit
    if(output_file.bad()) {
       cout << "Writing to file failed" << endl;
    } 
    else {
        output_file << "Hello";
        cout << "Successfully written to " << fname;
    }

    output_file.close();

    return 0;
}
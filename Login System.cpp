/*
Simple project to allow the user to create an account
and access that same account. Created for us in
larger future project.
*/

#include <iostream>
#include <fstream>
#include <string>
#include "Windows.h" // Included for Sleep()

using namespace std;

void ClearScreen() { // Simple function used to easily clear the screen
    cout << "\033[2J\033[1;1H";
}

bool IsLoggedIn() {

    string username, password, un, pw;

    cout << "Enter your username: "; cin >> username;
    cout << endl << "Enter your password: "; cin >> password;

    ifstream read(username + ".txt"); // Reads file to verify account
    getline(read, un); // Compares username to username in database
    getline(read, pw); // Compares password to password in database

    if (un == username && pw == password) { // Return true or false if account has been verified
        return true;
    }
    else {
        return false;
    }
}

int main() {
    
    int choice;

    cout << "1. Register" << endl;
    cout << "2. Login" << endl;
    cout << "Your choice: "; cin >> choice;
    
    if (choice == 1) {

        string username, password;

        cout << "Select a username: "; cin >> username;
        cout << "Select your password: "; cin >> password;

        ofstream file;

        file.open(username + ".txt");           // Opens file created when registering
        file << username << endl << password;   // Checks username and password within file
        file.close();                           // Closes the file

        main(); // Returns to start of program
    }
    else if (choice == 2) {
        bool status = IsLoggedIn();

        if (!status) { // Checks if login bool is true or false
            cout << "Incorrect login" << endl;
            system("PAUSE");
            return 0;
        }
        else {
            cout << "Successfully logged in!" << endl;
            system("PAUSE");
            return 1;
        }
    }

    else {
        cout << "Invalid input, please input a valid option.";
        Sleep(5000); // Delays next the screen from clearing

        int choice = 0;
        ClearScreen(); // Simple function to remove previous text from screen

        main(); // Returns to start of program
    }
}

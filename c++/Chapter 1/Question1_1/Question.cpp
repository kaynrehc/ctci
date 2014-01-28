#include<string.h>
#include<iostream>
#include<string>

using namespace std;

bool isUniqueChars(string str) {

	if (str.length() > 256) {
		return false;
	}

	int flag = 0;
	for (int i = 0; i < str.length(); i++) {
		int value = str[i] - 'a';
		if ((flag & (1 << value)) > 0)
			return false;
		flag |= (1 << value);
	}
	return true;
}

bool isUniqueChars2(string str) {

	if (str.length() > 256) {
		return false;
	}

	bool ascii_set[256] = { false };

	for (int i = 0; i < str.length(); i++) {
		int value = str[i];
		if (ascii_set[value])
			return false;
		ascii_set[value] = true;
	}
	return true;
}

bool isUniqueChars3(char *str) {

	if (strlen(str) > 256) {
		return false;
	}

	for (int i=0; i<strlen(str)-1; i++) {
		for (int j=i+1; j<strlen(str); j++) {
			if (str[i]==str[j]) {
				cout << "i=" << i <<endl;
				cout << "j=" << j <<endl;
				return false;
			}
		}
	}

	return true;
}

/* Function to print true and false */
string result(bool value) {
	if (value)
		return "True";
	else
		return "False";
}

int main() {
	char *input[]= { "abcde", "aba", "Michael", "1231", "abcdefghijklmnopqrstuvwxyzb" };

	for (int i = 0; i < 5; i++) {
		//cout << input[i] << " is " << result(isUniqueChars(input[i])) << endl;
		cout << input[i] << " is " << result(isUniqueChars3(input[i])) << endl;
	}

	return 0;
}

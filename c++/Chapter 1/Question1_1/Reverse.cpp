#include<string.h>
#include<iostream>
#include<string>

using namespace std;

void reverse(char *str) {
	int i=0;
	int j=strlen(str)-1;

	while (i<j) {
		int x = str[j];
		*(str+j) = *(str+i);
		*(str+i) = x;
		i++;
		j--;
	}
}

/* Function to print true and false */
string result(bool value) {
	if (value)
		return "True";
	else
		return "False";
}

int main() {
	char str[100];
	strcpy(str, "abc");
	cout << str << endl;
	
	reverse(str);
	cout << str << endl;

	return 0;
}

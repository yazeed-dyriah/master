#include <iostream>
#include <fstream>
#include<string>
using namespace std;

void getFileContent(string file_path) {
	//	string str[100];
//	int index = 0;
	string line = "";
	string linesArray = { NULL };
	ifstream myReadFile;
	myReadFile.open(file_path);
	int i = 0;
	if (myReadFile.is_open()) {
		while (!myReadFile.eof()) {
			getline(myReadFile, line);
			linesArray.append(line);
			//lines[index++] = line;
			cout << line << endl;

		}




	}
	myReadFile.close();

	//	return str;
}
int main()
{


	getFileContent("file_path.txt");

	return 0;
}
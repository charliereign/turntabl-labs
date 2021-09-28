#include <iostream>
#include <string.h>
using namespace std;

int main(int argc, char const *argv[])
{
    string word;
    cin >> word;

    int len = word.length();

    char splitWord[len];

    for (int i = 0; i < sizeof(splitWord); i++)
    {
        splitWord[i] = word[i];
        cout << splitWord[i] <<endl;
    }
    
    
    

    //cout << *wordArr << endl;




    return 0;
}

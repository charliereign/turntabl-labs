#include <iostream>

using namespace std;

int main(int argc, char const *argv[])
{
    // int num;
    // int *pt;
    // num = 45;
    // pt = &num;

    // cout << num <<endl;
    // cout << pt;

    // int i = {5};
    // int *p = {&i};
    // *p = 10;

    // cout << *p <<endl;

    // char array[] {"hey"};
    // char *p{array};

    // cout << *p <<" " << &array <<endl;

    // int i {20};
    // char c {'F'};
    // double d {3.146};

    // int *ip {&i};
    // char *cp {&c};
    // double *dp {&d};

    // cout << *ip <<endl;

    int y {5};
    const int *yp = &y;
    const int a = {5};
    const int *ap = &a;
    cout<<*ap;
    //demotion
    *(const_cast<int *> (ap)) = 20;
    y++;
    //promotion
    // *yp = 5 <- throws error
    cout<<*yp;
    cout<<y;
    cout<<*ap;

    return 0;
}

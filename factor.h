//TODO: FACTORIAL
int factorial(int n){
    if (n == 0)
    {
        return 1;
    }
    int facto = 1;
    for (int i = 1; i <= n; i++)
    {
       facto *= i;
    }
    return facto;
}
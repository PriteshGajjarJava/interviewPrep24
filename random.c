#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    // Seed the random number generator
    srand(time(NULL));

    // Generate a random number between 1 and 42
    int random_number = rand() % 30 + 1;

    printf("Random number between 1 and 30: %d\n", random_number);
    return 0;
}


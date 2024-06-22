#include <stdio.h>

int main() {
  int n;
  printf("Enter number:");
  scanf("%d", &n);
  int i = n;	
  // 4 
  int fact = 1;
  while (i > 1) {
   fact = fact * i;
   i--;
  }
  printf("Factorial of %d is : %d\n", n, fact);
}

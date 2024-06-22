#include <stdio.h>


int reverse(int num) {
  int rev = 0;
  
  while (num!=0) {
    int rem = num % 10;
    rev = (rev*10) + rem;
    num = num / 10;
  }
  return rev;
}
int main() {
  int num;
  printf("Enter number:");
  scanf("%d", &num);

  int result = reverse(num);
  printf("Reverse of %d is %d xyz", num, result);

}


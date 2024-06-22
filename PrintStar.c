#include <stdio.h>

int main() {
   int n = 0;
   printf("Enter n: ");
   scanf("%d", &n);

   if (n < 0) {
     printf("Error: Invalid number");
     return -1;
   }
   int i,j;
   for(i=1; i<=n; i++) {
	for(j=1; j<=i; j++) {
	  printf(" * ");
	}
	printf("\n");
   }

}

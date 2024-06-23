import java.util.Arrays;

// Sort the array
// Travese an array with assumption of getting number in sequence from 1 to n
// if assumption get wrong then return that number

class FindMissing {
 public static void main(String[] args) {
  int arr[] = {1,5,8,3,7,2,6}; // Missing is 4
  int n = arr.length + 1;
  int expectedAddition = (n * (n+1))/2;
  int actualAddition = 0;

  for (int i=0; i < arr.length; i++) {
	actualAddition += arr[i];
  }
  int missingNumber = expectedAddition - actualAddition;
  System.out.println("Missing number is:" + missingNumber);
  
  /*
  Arrays.sort(arr); // O(n logn)
  System.out.println(Arrays.toString(arr));

  int i = 1;
  while (i < arr.length) {
    if (arr[i-1] != i) {
      System.out.println("Missing number is: " + i);
      System.exit(0);
    }
    i++;
  }*/
 }
}




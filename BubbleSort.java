import java.util.Arrays;
class BubbleSort {
  public static void main(String[] args) {
	// [7 10 1 5 0 2] 
	int [] arr = {9, 19, 22, 8, 11, 7,10,13,51,7,2,0};  // 
	
	System.out.println("Original:" + Arrays.toString(arr));
	bubbleSort(arr);
	System.out.println("Ans:" + Arrays.toString(arr));
  }

  static void bubbleSort(int[] a) {
    boolean swapped = false;
    do {
     swapped = false;
     for (int i=0, j=1; j < a.length ; i++,j++) {
	// compare consecutive numbers
	if (a[j] < a[i]) {
	 // swap
	 int t = a[i];
	 a[i] = a[j];
	 a[j]=t;
	 swapped = true;
	}
      }//end of for loop
     }while(swapped == true);
  }

}

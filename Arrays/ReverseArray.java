import java.util.Arrays;
class ReverseArray {
  public static void main(String[] args) {
    int[] arr = {3,4,5,1,0,9,2};
   
    //int[] output1 = reverse(arr);
    //System.out.println(Arrays.toString(output1));
	
    reverseOriginal(arr);
    System.out.println(Arrays.toString(arr));
  }

  // O(n).. Additional space is required
  static int[] reverse(int[] a) {
	int[] b = new int[a.length];
	for (int i=a.length-1, j=0 ; i>=0; i--,j++) {
	  b[j] = a[i];
	}
	return b;
  }

  // optimised solution with O(n/2) -> Using "Two pointer approach"

  static void reverseOriginal(int[] a) {
    for (int i=0, j=a.length-1; i<j; i++,j--){
	//swap logic
	int t = a[i];
	a[i]=a[j];
	a[j]=t;
    }
  }
}




















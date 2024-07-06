class FindMinMax {
  public static void main(String[] args) {
	int[] arr = {10, 1, 2, 9, -2, 19, 11, 5, 7};
	int max = findMax(arr);
	System.out.println("Max number is: " + max);
  }

  static int findMax(int[] arr) {
	int max = Integer.MIN_VALUE;//-2147483648

	for (int i=0; i < arr.length; i++) {
		if (arr[i]%2 == 0 && arr[i] > max) {
		 max = arr[i];//18
		}
	}
	return max;
  }

}

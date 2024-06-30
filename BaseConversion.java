class BaseConversion {
  public static void main(String[] args) {
	// System.out.println(Integer.toBinaryString(91));
	// System.out.println(Integer.parseInt("110011", 2));
	// System.out.println(Integer.parseInt("20", 8));
  	System.out.println(toBinaryString(72));
	System.out.println(toDecimal("10011001"));
  }

  // Number to binary
  static String toBinaryString(int n) {
	String output = "";

	while (n!=0) {
	  output = n % 2 + output;
	  n = n/2;
	}
	return output;
  }

  // Binary string to Decimal number
  static int toDecimal(String bin) {
    //1101
    int power = bin.length() - 1; //3
    int ans = 0;
    while (bin.length() > 0) {
    	int digit = Integer.parseInt(""+bin.charAt(0));// 1
	ans = ans + digit * (int)Math.pow(2, power);
        power--;
	bin = bin.substring(1);
    }
    return ans;
  }
}























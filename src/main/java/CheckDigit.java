import java.util.ArrayList;

public class CheckDigit {

  /** Returns the check digit for num, as described in part (a).  
   *  Precondition: The number of digits in num is between one and    
   *  six, inclusive.  
   *  num >= 0  
   */ 
  public static int getCheck(int num) {
    int nDigits = getNumberOfDigits(num);
    int j = 7;
    int sum = 0;
    ArrayList<Integer> l = new ArrayList<>();

    // Extract digits from num
    int originalNum = num; // Backup num if needed
    while (num > 0) {
      l.add(0, num % 10);
      num = num / 10;
    }

    if (nDigits >= 1 && nDigits <= 6) {
      for (int i = 0; i < l.size(); i++) {
        l.set(i, l.get(i) * j);
        j--;
        sum += l.get(i);
      }
    }

    return sum % 10; // Return check digit
  }

  /** Returns true if numWithCheckDigit is valid, or false    
   *  otherwise, as described in part (b). 
   *  Precondition: The number of digits in numWithCheckDigit   
   *  is between two and seven, inclusive.
   *  numWithCheckDigit >= 0     
   */     
  public static boolean isValid(int numWithCheckDigit) {
    return numWithCheckDigit%10 == getCheck(num);
  }

  /** Returns the number of digits in num. */    
  public static int getNumberOfDigits(int num) {      
    if (num < 10)
      return 1;
    return 1 + getNumberOfDigits(num / 10);    
  }    

  /** Returns the nth digit of num.      
   *  Precondition: n >= 1 and n <= the number of digits in num     
   */    
  public static int getDigit(int num, int n) {
    int pos = getNumberOfDigits(num) - n + 1;
    while (pos > 1) {
      num /= 10;
      pos--;
    }
    return num % 10;
  }     
}

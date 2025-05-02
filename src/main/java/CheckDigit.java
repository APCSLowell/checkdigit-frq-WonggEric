public class CheckDigit 
{   
  /** Returns the check digit for num, as described in part (a).  
   *  Precondition: The number of digits in num is between one and    
   *  six, inclusive.  
   *          num >= 0  
   */ 
  
   public static int getCheck(int num) 
   {  
     int nDigits = 0;
     int j = 7;
     int sum = 0;
     ArrayList <Integer> l = new ArrayList<>();
     while(num>){
      l.add(0,num%10);
      num = num/10;
      nDigits++;
     }
     for(int i = 0;i<l.size();i++){
        l.set(i,l.get(i)*j);
        j--;
        num+=l.get(i);
     }
     return num%10;
     /* to be implemented in part (a) */
   }
 
  /** Returns true if numWithCheckDigit is valid, or false    
   *  otherwise, as described in part (b). 
   *  Precondition: The number of digits in numWithCheckDigit   
   *  is between two and seven, inclusive.
   *                numWithCheckDigit >= 0     
   */     
   public static boolean isValid(int numWithCheckDigit)    
   {      
     /* to be implemented in part (b) */ 
     if(numWithCheckDigit%10 == getCheck(num)
        return true;
     return false;
   }    
   
   /** Returns the number of digits in num. */    
   public static int getNumberOfDigits(int num)    
   {      
    if(num < 10)
      return 1;
    return 1 + getNumberOfDigits(num/10);    
   }    
   
   /** Returns the nthdigit of num.      
    *  Precondition: n >= 1 and n <= the number of digits in num     
    */    
    public static int getDigit(int num, int n)    
    {      
      int pos = getNumberOfDigits(num)-n+1;
      while(pos > 1){
        num/=10;
        pos--;
      }
      return num%10;
    }     

}

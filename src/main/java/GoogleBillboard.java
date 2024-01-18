// I attempted to do level 2, but it's wouldn't give me a checkmark because it only check level 1.
// the link to my code is https://github.com/jerrythepresident/GoogleBillboard/blob/master/GoogleBillboard.pde, it works perfectly on processing.

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
	int consecutiveDigits = 10;
  int startIndex = 1;
  boolean primeFound = false;

while ((!primeFound) && startIndex + consecutiveDigits <= e.length()) {
        String substring = e.substring(startIndex, startIndex + consecutiveDigits);
        double parsedDouble = Double.parseDouble(substring);
        
    if (isPrime(parsedDouble)) {
                  System.out.println("Prime: " + substring);
                  primeFound = true;
              } 

              startIndex++;
       }

		public static boolean isPrime(double dNum){  
  if (dNum<2){
    return false;
  }
  for(int i=2; i<=Math.sqrt(dNum); i++){
    if(dNum%i==0){
  return false;
  }
  }
  return true;
}
	
	}
	

//This Code is written By Rohit Singh Rana
public class QuadraticCongruenceCRT {
	
	static int n1;
	static int n2;
	// A function to print all prime factors 
    // of a given number n 
    public static int primeFactors(int n) 
    { 
        // Print the number of 2s that divide n 
        while (n % 2 == 0) { 
            System.out.print(2 + " "); 
            n /= 2; 
        } 
  
        // n must be odd at this point.  So we can 
        // skip one element (Note i = i +2) 
        for (int i = 3; i <= Math.sqrt(n); i += 2) { 
            // While i divides n, print i and divide n 
            while (n % i == 0) { 
                n /= i; 
                return i; 
            } 
        } 
  
        // This condition is to handle the case whien 
        // n is a prime number greater than 2 
        if (n > 2) 
            System.out.print(n);
		return n; 
    } 
	
	
	public static void main(String[] args) {
		int a=7;
		int n=33;
		System.out.println("Given Quadratic Equation : x^2 ≡ "+a+" mod "+n);
		System.out.println();
		//n is not a prime number but we can factorize it with multiplication of prime number
		int n1=primeFactors(n); 
		int n2=primeFactors(n);
		n1=3;
		n2=11;
	
		System.out.println("Prime factor of "+n+" is : "+n1+" and "+n2);
		System.out.println();
		System.out.println("So the Quadratic Equation : x^2 ≡ "+a+" mod "+n+" can be written as");
		System.out.print("x^2 ≡ "+a+" mod "+n1);
		System.out.print("   and   ");
		System.out.println("x^2 ≡ "+a+" mod "+n2);
		System.out.println();
		System.out.println("After Applying Multiplicative Inverse equations are : ");
		int a1=a%n1;
		System.out.print("x^2 ≡ "+a1+" mod "+n1);
		System.out.print("   and   ");
		int a2=a%n2;
		System.out.println("x^2 ≡ "+a2+" mod "+n2);
		System.out.println();
		
		//Now Aply chinese remainder theorem(CRT)
		//for equation x^2 ≡ 1 mod 3 
		if(n1%a1 != 0) {
			
			if( (a1^((n1-1)/2)) % n1 != 1) {
				System.out.println("No solution exist for equation : x^2 ≡ "+a+" mod "+n);
				System.out.println("so for P = "+n+", the given Quadratic Equation is not solvable");
			}else {
				System.out.println("Solution Exist : there are two solutions ");
			}
		}
		else {
			System.out.println("Solution exist for equation : x^2 ≡ "+a1+" mod "+n1);
		}
		
		//for equation x^2 ≡ 7 mod 11
		
		if(n2%a2 != 0) {
			
			if( (a2^((n2-1)/2)) % n2 != 1) {
				System.out.println("No solution exist for equation : x^2 ≡ "+a2+" mod "+n2);
				System.out.println();
				System.out.println("so for n = "+n+", the given Quadratic Equation is not solvable");
			}else {
				System.out.println("Solution Exist : there are two solutions ");
			}
		}
		else {
			System.out.println("solution exist for equation : x^2 ≡ "+a2+" mod "+n2);
		}
		
	}
}

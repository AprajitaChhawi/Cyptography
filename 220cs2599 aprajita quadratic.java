//This Code is written By Rohit Singh Rana
public class LinearCongruenceCRT {
	public static void main(String[] args) {
		//Here i took static variables as per the question given
		int x1=3;
		int a1=4;
		int n1=5;
		int x2=9;
		int c=4;
		int a2=12;
		int n2=7;
		int inv1;
		int inv2;
		System.out.println("Given Equations are :");
		System.out.println("Equation 1: "+x1+"x ≡ "+a1+" mod "+n1);
		System.out.print("Equation 2: "+x2+"x + "+ c+ " ≡ "+a2+" mod "+n2);
		System.out.print("   (OR)   ");
		a2=a2-c;
		System.out.println(x2+"x ≡ "+a2+" mod "+n2);
		System.out.println();
		for(int i=1;;i++) {
			if((x1*i)%n1 == 1) {
				inv1=i;
				break;
			}
		}
		for(int i=1;;i++) {
			if((x2*i)%n2 == 1) {
				inv2=i;
				break;
			}
		}
		a1=a1*inv1;
		a2=a2*inv2;
		System.out.println("After Applying multiplicative inverse Equations are : ");
		System.out.print("Equation 1: x ≡ "+a1+" mod "+n1);
		System.out.print("   (OR)   ");
		a1=a1%n1;
		System.out.println("x ≡ "+a1+" mod "+n1);
		System.out.print("Equation 2: x ≡ "+a2+" mod "+n2);
		System.out.print("   (OR)   ");
		a2=a2%n2;
		System.out.println("x ≡ "+a2+" mod "+n2);
		System.out.println();
		int M=n1*n2;
		int m1=M/n1;
		int m2=M/n2;
		for(int i=1;;i++) {
			if((m1*i)%n1 == 1) {
				inv1=i;
				break;
			}
		}
		for(int i=1;;i++) {
			if((m2*i)%n2 == 1) {
				inv2=i;
				break;
			}
		}
		int X=(m1*inv1*a1)+(m2*inv2*a2);
		X=X%M;
		System.out.println("The Solution to the simulyaneous equation is at x= "+X);
		System.out.println("Equation 1: "+X+" ≡ "+a1+" mod "+n1);
		System.out.print("Equation 2: "+X+" ≡ "+a2+" mod "+n2);
	}
}

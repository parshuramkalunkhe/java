// Q.105. Trianle Patterns.
/*
 
R Triangle.
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * *

R Reverse Triangle
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

L Triangle
        * 
      * * 
    * * * 
  * * * * 
* * * * * 

L Reverse Triangle
* * * * * 
  * * * * 
    * * * 
      * * 
        * 
          

Perfect Triangle
    * 
   * * 
  * * * 
 * * * * 
* * * * *  



 */

public class Question_105 {
	public static void main(String[] args) {
		System.out.println("R Triangle.");
		for (int row = 0; row <= 5; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("R Reverse Triangle");

		for (int row = 0; row <= 5; row++) {
			for (int col = 5; col >= row; col--) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("L Triangle");
		int n = 5;
		int row, col;
		for (row = 1; row <= n; row++) {
			for (col = 1; col <= n - row; col++) {
				System.out.print("  ");
			}
			for (col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		n = 5;
		
		System.out.println();
		System.out.println("L Reverse Triangle");
		for (row = 0; row <= n; row++) {
			for (col = 1; col <= row; col++) {
				System.out.print("  ");
			}
			for (col = 1; col <= n - row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Perfect Triangle");
		
	    for (row = 1; row <= 5; row++) {

	        	for (col = 1; col <= 5 - row; col++) {
	                System.out.print(" ");
	            }

	        	for (col = 1; col <= row; col++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
		
	}

}

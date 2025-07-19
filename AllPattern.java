
public class AllPattern {

	public static void SquareHellowPattern() {

		int num = 8;

		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (i == 0 || j == 0 || i == num || j == num) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public static void NumberTriangle() {

		int num = 7;
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

	public static void NumberIncreasing() {
		int num = 7;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

	public static void NumberIncreasingReversed() {
		int num = 7;
		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

	public static void NumberChangeing() {
		int num = 4;
		int count = 1;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

	public static void ZeroOneTriangle() {
		int num = 4;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

	public static void PalindromTrianglePattern() {

		int num = 6;

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= 2 * (num - i); j++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}

			for (int j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

	}

	public static void DiamondTrianglePattern() {
		int num = 6;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void RhombusPattern() {
		int num = 7;

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void DaimondPattern() {
		int num = 5;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = num - 1; i >= 1; i--) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void RactangleFill() {
		int num = 6;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void RightHalfPattern() {
		int num = 6;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void ReversRightHalfPattern() {
		int num = 6;
		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void LeftHalfPattern() {
		int num = 6;
		for (int i = num; i>= 1; i--) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= num - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void ReverseLeftHalfPattern() {
		int num = 6;
		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void KPattern() {
		int num = 6;
		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 2; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void ReverseNumberTriangle() {
		int num = 6;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = i; j <= num; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	public static void MirrorImgTrianglePattern() {

		int num = 6;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= num; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = num - 1; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= num; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	public static void HollowTrianglePattern() {

		int num = 6;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (i == 3 && j == 2) {
					System.out.print("  ");
				}else if (i==4) {
					if(j== 2 || j==3) {
						System.out.print("  ");
					}else {
						System.out.print("* ");
					}
				}
				else if (i==5) {
					if(j== 2 || j==3 ||j==4) {
						System.out.print("  ");
					}else {
						System.out.print("* ");
					}
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	public static void ReverseHollowTrianglePattern() {

		int num = 6;

		for (int i = num; i >=1; i--) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (i == 3 && j == 2) {
					System.out.print("  ");
				}else if (i==4) {
					if(j== 2 || j==3) {
						System.out.print("  ");
					}else {
						System.out.print("* ");
					}
				}
				else if (i==5) {
					if(j== 2 || j==3 ||j==4) {
						System.out.print("  ");
					}else {
						System.out.print("* ");
					}
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
	public static void DiamondHollowPattern() {	
		int num=6;
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= num - i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					if (i == 3 && j == 2) {
						System.out.print("  ");
					}else if (i==4) {
						if(j== 2 || j==3) {
							System.out.print("  ");
						}else {
							System.out.print("* ");
						}
					}
					else if (i==5) {
						if(j== 2 || j==3 ||j==4) {
							System.out.print("  ");
						}else {
							System.out.print("* ");
						}
					}
					else if (i==6) {
						if(j== 2 || j==3 ||j==4 ||j==5) {
							System.out.print("  ");
						}else {
							System.out.print("* ");
						}
					}
					else {
						System.out.print("* ");
					}
				}
				System.out.println();
			}
			
			for (int i = num-1; i>=1; i--) {
				for (int j = 1; j <= num - i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					if (i == 3 && j == 2) {
						System.out.print("  ");
					}else if (i==4) {
						if(j== 2 || j==3) {
							System.out.print("  ");
						}else {
							System.out.print("* ");
						}
					}
					else if (i==5) {
						if(j== 2 || j==3 ||j==4) {
							System.out.print("  ");
						}else {
							System.out.print("* ");
						}
					}
					else if (i==6) {
						if(j== 2 || j==3 ||j==4 ||j==5) {
							System.out.print("  ");
						}else {
							System.out.print("* ");
						}
					}
					else {
						System.out.print("* ");
					}
				}
				System.out.println();
			}	
	}
	
	public static void HollowHourGlassPattern() {
		int num=6;
		
		for (int i = num; i >=1; i--) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (i == 3 && j == 2) {
					System.out.print("  ");
				}else if (i==4) {
					if(j== 2 || j==3) {
						System.out.print("  ");
					}else {
						System.out.print("* ");
					}
				}
				else if (i==5) {
					if(j== 2 || j==3 ||j==4) {
						System.out.print("  ");
					}else {
						System.out.print("* ");
					}
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		for (int i = 2; i <=num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (i == 3 && j == 2) {
					System.out.print("  ");
				}else if (i==4) {
					if(j== 2 || j==3) {
						System.out.print("  ");
					}else {
						System.out.print("* ");
					}
				}
				else if (i==5) {
					if(j== 2 || j==3 ||j==4) {
						System.out.print("  ");
					}else {
						System.out.print("* ");
					}
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {

		SquareHellowPattern();
		System.out.println();
		NumberTriangle();
		System.out.println();
		NumberIncreasing();
		System.out.println();
		NumberIncreasingReversed();
		System.out.println();
		NumberChangeing();
		System.out.println();
		ZeroOneTriangle();
		System.out.println();
		PalindromTrianglePattern();
		System.out.println();
		DiamondTrianglePattern();
		System.out.println();
		RhombusPattern();
		System.out.println();
		DaimondPattern();
		System.out.println();
		RactangleFill();
		System.out.println();
		RightHalfPattern();
		System.out.println();
		ReversRightHalfPattern();
		System.out.println();
		LeftHalfPattern();
		System.out.println();
		ReverseLeftHalfPattern();
		System.out.println();
		KPattern();
		System.out.println();
		ReverseNumberTriangle();
		System.out.println();
		MirrorImgTrianglePattern();
		System.out.println();
		HollowTrianglePattern();
		System.out.println();
		ReverseHollowTrianglePattern();
		System.out.println();
		DiamondHollowPattern();
		System.out.println();
		HollowHourGlassPattern();
		System.out.println();
/*
		
*********
*       *
*       *
*       *
*       *
*       *
*       *
*       *
*********

       1 
      2 2 
     3 3 3 
    4 4 4 4 
   5 5 5 5 5 
  6 6 6 6 6 6 
 7 7 7 7 7 7 7 

1       
1 2      
1 2 3     
1 2 3 4    
1 2 3 4 5   
1 2 3 4 5 6  
1 2 3 4 5 6 7 

1 2 3 4 5 6 7 
1 2 3 4 5 6  
1 2 3 4 5   
1 2 3 4    
1 2 3     
1 2      
1       

1    
2 3   
4 5 6  
7 8 9 10 

1    
0 1   
1 0 1  
0 1 0 1 

          1 
        2 1 2 
      3 2 1 2 3 
    4 3 2 1 2 3 4 
  5 4 3 2 1 2 3 4 5 
6 5 4 3 2 1 2 3 4 5 6 

     *
    ***
   *****
  *******
 *********
***********

 *******
  *******
   *******
    *******
     *******
      *******
       *******

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

* * * * * * 
* * * * * * 
* * * * * * 
* * * * * * 
* * * * * * 
* * * * * * 

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 

* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

      
     *
    **
   ***
  ****
 *****

******
 *****
  ****
   ***
    **
     *

* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 

1 2 3 4 5 6 
 2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6 

1 2 3 4 5 6 
 2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6 
    5 6 
   4 5 6 
  3 4 5 6 
 2 3 4 5 6 
1 2 3 4 5 6 

     * 
    * * 
   *   * 
  *     * 
 *       * 
* * * * * * 

* * * * * * 
 *       * 
  *     * 
   *   * 
    * * 
     * 

     * 
    * * 
   *   * 
  *     * 
 *       * 
*         * 
 *       * 
  *     * 
   *   * 
    * * 
     * 

* * * * * * 
 *       * 
  *     * 
   *   * 
    * * 
     * 
    * * 
   *   * 
  *     * 
 *       * 
* * * * * * 

*/
		
	}
}

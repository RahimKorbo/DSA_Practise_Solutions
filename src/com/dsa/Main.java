package com.dsa;
/*

1.  *****
    *****
    *****
    *****
    *****

    *
    **
    ***
    ****
    *****

3.  *****
    ****
    ***
    **
    *

4.  1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

5.  *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *

    *       1   4   1
   **       2   3   2
  ***       3   2   3
 ****       4   1   4
*****       5   0   5

7.   *****  1   0
      ****  2   1
       ***  3   2
        **  4   3
         *  5   4


 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        int n=5;
//        pattern01(n);
//        pattern02(n);
//        pattern03(n);
//        pattern04(n);
//        pattern05(n);
//        pattern06(n);
         pattern07(n);

    }

    private static void pattern07(int n) {
        for(int i=1;i<=n;i++) {
            for(int s=1;s<=i-1;s++) {
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern06(int n) {

        for(int i=1;i<=n;i++) {
            for(int s=1; s<=n-i; s++){
                System.out.print(" ");
            }
            for(int j=1; j<=i ;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void pattern05(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void pattern04(int n) {

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }


    private static void pattern03(int n) {
        for(int i=1;i<=n;i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }


    private static void pattern02(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }


    private static void pattern01(int n) {
        for(int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}

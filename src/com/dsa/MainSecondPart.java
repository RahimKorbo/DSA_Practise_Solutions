package com.dsa;
/*
                    n=5;
8.      *           1   1   0
       ***          2   3   1
      *****         3   5   2
     *******        4   7   3
    *********       5   9   4

    ***** ****      1   5
     **** ***       2   4
      *** **        3   3
       ** *         4   2
        *           5   1

 */
public class MainSecondPart {
    public static void main(String[] args) {
        int n=5;
        pattern08(n);
        pattern09(n);

    }

    private static void pattern09(int n) {
        for(int i=1;i<=n;i++) {
            for(int s=1;s<=i-1+1;s++){
                System.out.print("  ");
            }
            for(int j=1;j<=n-i-1;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=n-i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern08(int n) {
        for(int i=1;i<=n;i++) {
            for(int s=1;s<=n-i;s++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

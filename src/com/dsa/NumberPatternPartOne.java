package com.dsa;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

/*
16.           1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1

     1  1
    11  2
   121  4
  1331  8
 14641  16

 */
public class NumberPatternPartOne {
    public static void main(String[] args) {
        int n=5;
        pattern01(n);
    }

    private static void pattern01(int n) {
        int c=1;
        for(int i=0;i<n;i++){
            for(int s=1;s<n-i; s++) {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++) {
                if(j==0 || i==0){
                    c=1;
                }else {
                    c=c * (i - j + 1) / j;
                }
                System.out.print(c + " ");
            }
            System.out.println();
        }
//        int coe=1,rows = 6;
//        for(int i = 0; i < rows; i++) {
//            for(int space = 1; space < rows - i; ++space) {
//                System.out.print("  ");
//            }
//
//            for(int j = 0; j <= i; j++) {
//                if (j == 0 || i == 0)
//                    coe = 1;
//                else
//                    coe = coe * (i - j + 1) / j;
//
//                System.out.printf("%4d", coe);
//            }
//            System.out.println();
//        }

    }
}

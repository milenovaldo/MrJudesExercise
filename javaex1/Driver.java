package com.company;
import java.util.Arrays;
import com.company.Utility;
import java.util.Scanner;
public class Driver {
    // use public, so different class can use it
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Utility u = new Utility();

        // exercise 1
       int a[] = {2,8,6,3,2};
       System.out.println("Before" + Arrays.toString(a));
       int num = u.split(a);

//        // exercise 2
       int arr2[] = {1, 2, 3, 4, 5};
       System.out.println("Before: " + Arrays.toString(arr2));
       int num2 = u.getRot(arr2);

//        // exercise 3
       int matrix[][] = {{1, 2, 3},
               {4, 5, 6},
               {7, 8, 9}};
       if (u.isSymmetric(matrix, 3)) {
           System.out.println("Yes, the matrix is symmetric");
       } else {

           System.out.println("NO");
       }

        // exercise 4
        // magic square for odd number
       u.checkEven();
        // magic square for even number
       u.checkOdd();

    }
}

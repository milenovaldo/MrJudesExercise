package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Utility {
    Scanner sc = new Scanner(System.in);

    public int split(int a[]) {
        int b[] = new int[6];
        int i;
        int highest = a[0];
        int second_highest = a[0];
        int j = 0;
        for(i=0;i<5;i++)
        {
            if(a[i]>highest)
            {
                highest = a[i];
                j = i;
            }
        }
        for(i = 0;i<5;i++)
        {
            if(a[i]<highest && a[i]>second_highest)
            {
                second_highest = a[i];
            }
        }

        for(i = 0;i<j;i++)
        {
            b[i] = a[i];
        }
        b[j] = second_highest;
        b[j+1] = highest-second_highest;
        for(i = j+2;i<6;i++)
        {
            b[i] = a[i-1];
        }
        for(i = 0;i<6;i++)
        {
            System.out.println(b[i]+" ");
        }
        return 0;

    }
    
// for no 2
   public int getRot(int a[]) {
       int t = a[4], i;
       for (i = 4; i >= 1; i--) {
           a[i] = a[i - 1];
       }
       a[0] = t; // make the index 0 is 5
       for (i = 0; i <= 4; i++) {
           System.out.print(a[i]);
       }
       return t;
   }

// for no 3
       static int MAX = 100;
       // Fills transpose of mat[N][N] in tr[N][N]
       public static void transpose(int mat[][], int tr[][], int N)
       {
           for (int i = 0; i < N; i++)
               for (int j = 0; j < N; j++)
                   tr[i][j] = mat[j][i];
       }

//     Returns true if mat[N][N] is symmetric, else false
       public boolean isSymmetric(int mat[][], int N)
       {
           int tr[][] = new int[N][MAX];
           transpose(mat, tr, N);
           for (int i = 0; i < N; i++)
               for (int j = 0; j < N; j++)
                   if (mat[i][j] != tr[i][j]){
                       return false;}
           return true;
       }

    // for no 4
    // function to generate odd magic square
    // the resulting matrix must contain distinct integrs in the inlcusve range [1,n^2]
    // n is matrix by odd number

   public static void getOdd(int n) {
       int[][] magicSquare = new int[n][n];

       // Initialize position for 1
       int i = n / 2;
       int j = n - 1;

       // One by one put all values in magic square
       for (int num = 1; num <= n * n; ) {
           if (i == -1 && j == n) //3rd condition
           {
               j = n - 2;
               i = 0;
           } else {
               //1st condition helper if next number
               // goes to out of square's right side
               if (j == n)
                   j = 0;

               //1st condition helper if next number is
               // goes to out of square's upper side
               if (i < 0)
                   i = n - 1;
           }

           //2nd condition
           if (magicSquare[i][j] != 0) {
               j -= 2;
               i++;
               continue;
           } else
               //set number
               magicSquare[i][j] = num++;

           //1st condition
           j++;
           i--;
       }

//             print magic square
       System.out.println("The Magic Square for " + n + ":");
       System.out.println("Sum of each row or column: " + n * (n * n + 1) / 2);
       for (i = 0; i < n; i++) {
           for (j = 0; j < n; j++)
               System.out.print(magicSquare[i][j] + " ");
           System.out.println();
       }

   }

   public void checkOdd() {
       System.out.println("Input odd number for magic square: ");
       int val = sc.nextInt();
       // print magic square
       getOdd(val);
   }

   //        // even magic square
   public int getEven(int n) {
       int[][] arr = new int[n][n];
       int i, j;

       // filling matrix with its count value
       // starting from 1;
       for (i = 0; i < n; i++) {
           for (j = 0; j < n; j++) {
               arr[i][j] = (n * i) + j + 1;
           }
       }
       // change value of Array elements
       // at fix location as per rule
       // (n*n+1)-arr[i][j]
       // Top Left corner of Matrix
       // (order (n/4)*(n/4))
       for (i = 0; i < n / 4; i++) {
           for (j = 0; j < n / 4; j++) {
               arr[i][j] = (n * n + 1) - arr[i][j];
           }
       }
       // Top Right corner of Matrix
       // (order (n/4)*(n/4))
       for (i = 0; i < n / 4; i++) {
           for (j = 3 * (n / 4); j < n; j++) {
               arr[i][j] = (n * n + 1) - arr[i][j];
           }
       }

       // Bottom Left corner of Matrix
       // (order (n/4)*(n/4))
       for (i = 3 * n / 4; i < n; i++) {
           for (j = 0; j < n / 4; j++) {
               arr[i][j] = (n * n + 1) - arr[i][j];
           }
       }
       // Bottom Right corner of Matrix
       // (order (n/4)*(n/4))
       for (i = 3 * n / 4; i < n; i++) {
           for (j = 3 * n / 4; j < n; j++) {
               arr[i][j] = (n * n + 1) - arr[i][j];
           }
       }
       // Centre of Matrix (order (n/2)*(n/2))
       for (i = n / 4; i < 3 * n / 4; i++) {
           for (j = n / 4; j < 3 * n / 4; j++) {
               arr[i][j] = (n * n + 1) - arr[i][j];
           }
       }
       // Printing the magic-square
       System.out.println("The magic square for " +n+ ": ");
       System.out.println("Sum of each row or column: " +n*(n*n+1)/2 );
       for (i = 0; i < n; i++) {
           for (j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
                System.out.println();

       }
       return n;
   }

   public void checkEven(){
       System.out.println("Input even num for the magic square matrix: ");
       int value = sc.nextInt();
       getEven(value);
   }
}






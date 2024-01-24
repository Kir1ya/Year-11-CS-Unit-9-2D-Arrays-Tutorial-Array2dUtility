import java.lang.reflect.Array;

public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] input) {
        for (int[] row : input) {
            for (int item : row) {
                System.out.println(item);
            }
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] input) {
        int sum2d = 0;
        for (int[] row : input) {
            for (int index : row) {
                sum2d += index;
            }
        }
        return sum2d;
    }
    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int [][] input) {
        int countInt = 0;
        double average = 0.0;
        for (int[] row : input) {
            for (int index : row) {
                countInt ++;
            }
        }
        average =  sum(input) / (double) countInt;
        return average;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int [][] input) {
        int minimum = Integer.MAX_VALUE;
        for (int[] row : input) {
            for (int index : row) {
                if (index < minimum) {
                    minimum = index;
                }
            }
        }
        return minimum;
    }
    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int [][] input) {
        int maximum = Integer.MIN_VALUE;
        for (int[] row : input) {
            for (int index : row) {
                if (index > maximum) {
                    maximum = index;
                }
            }
        }
        return maximum;
    }
    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int [][] input) {
        int evenCount = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] % 2 == 0) {
                    evenCount++;
                }
            }
        }
        return evenCount;
    }
    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int [][] input) {
        int evenCount = 0;
        for (int [] row : input) {
            for (int index : row) {
                if (index%2 == 0) {
                    evenCount++;
                }
            }
        }
        return evenCount;
    }
    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int [][] input) {
        for (int [] row : input) {
            for (int index : row) {
                if (index < 0) {
                    return false;
                }
            }
        }
        return true;
    }
    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int [][] input) {
        int sum = 0;
        int[] thing = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                thing[i] +=  input[i][j];
            }
        }
        return thing;
    }
    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int [][] input) {
        int sum = 0;
        /*
        [0,0,0]

        [0,0,0],
        [],
        [],
        []
         */
        int[] thing = new int[input[0].length];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                thing[j] +=  input[i][j];
            }
        }
        return thing;
    }
}

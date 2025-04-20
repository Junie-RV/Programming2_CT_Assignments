import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        int[] array = new int[5];
        int user_input;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter 5 integers: ");
        try {
            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextInt();
            }
            System.out.println(recursiveProduct(array, array.length - 1));
        }
        catch (Exception e){
            System.out.println("You have entered a non integer.\n" + e);
        }
    }

    // This method recursively multiplies all integers in the array and returns the product.
    public static int recursiveProduct(int[] arr, int n){
        if(n == 0){
            return arr[0]; // base case
        }
        else{
            return arr[n] * recursiveProduct(arr, n - 1); // recursive case
        }
    }
}
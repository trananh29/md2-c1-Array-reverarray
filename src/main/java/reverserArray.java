import java.util.Arrays;
import java.util.Scanner;

public class reverserArray {
    public static void main(String[] args) {
        int size;
        Scanner sc=new Scanner(System.in);
       do {
           System.out.println("Enter your size");
           size=sc.nextInt();
           if (size>20) System.out.println("your number does not exceed 20");
       } while (size>20);
       int array[]=new int[size];
       for (int i=0;i<array.length;i++) {
           System.out.print("Enter yout number index " + (i+1)+ " :");
           array[i]=sc.nextInt();
       }
        System.out.println(Arrays.toString(array));
        System.out.println("Reverser the array");
        for (int i=0;i<array.length/2;i++) {
            int temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(array));


    }
}

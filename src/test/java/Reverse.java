import java.util.Arrays;

public class Reverse {


    public static void main(String args[]) {
        int array[] = {1,4,5,6,8};


        for (int i = 0; i < array.length / 2; i++) {
               int temp = array[i];
               array[i] = array[array.length - 1 - i];
               array[array.length - 1 - i] = temp;
           }
        System.out.println(Arrays.toString(array));


    }}

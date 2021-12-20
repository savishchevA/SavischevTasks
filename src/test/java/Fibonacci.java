public class Fibonacci {
    public static void main(String[] args){
        int firstNumber = 1;
        int secondNumber = 1;
        int otherNumbers;
        System.out.print(firstNumber+" "+secondNumber+" ");
        for(int i = 3; i <= 20; i++){
            otherNumbers=firstNumber+secondNumber;
            System.out.print(otherNumbers+" ");
            firstNumber=secondNumber;
            secondNumber=otherNumbers;
        }
        System.out.println();
    }
}


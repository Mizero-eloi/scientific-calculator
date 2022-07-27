package src.scientificCalculator;

import java.util.Scanner;

public class Calculator {

    public static void main (String [] args){
        begin();
    }

    static void begin(){
        System.out.println("============================== Scientific calculator ==============================");
        System.out.println("\n");
        System.out.println("Choose an option you want: ");

        Scanner scanner = new Scanner(System.in);
        Operand num1 = new Operand(0);
        Operand num2 = new Operand(0);
        Operator operator = new Operator();


        int option = -1;
        while(option != 0){
            System.out.println("\nChoose an option you want: ");
            System.out.println("1. Add\n" +
                    "2. Subtraction\n" +
                    "3. Multiplication\n" +
                    "4. Division\n" +
                    "0. Exit"
            );
            option = scanner.nextInt();

            if (option == 0){
                return;
            }

            System.out.println("Enter 1st number: ");
            num1.setNum(scanner.nextInt());
            System.out.println("Enter 2nd number: ");
            num2.setNum(scanner.nextInt());

            Result result = new Result();


            switch (option){
                case 1:
                    result.setResult(operator.add(num1.getNum(), num2.getNum()));
                    break;
                case 2:
                    result.setResult(operator.subtract(num1.getNum(), num2.getNum()));
                    break;
                case 3:
                    result.setResult(operator.multiply(num1.getNum(), num2.getNum()));
                    break;
                case 4:
                    result.setResult(operator.divide(num1.getNum(), num2.getNum()));
                    break;

            }

            // Result
            System.out.println("Result : " + result.getResult());


        }



    }

}

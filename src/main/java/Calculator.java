import javax.swing.*;
import java.util.Scanner;
import static java.lang.Integer.*;

public class Calculator{
    public static final String delimeter = ",|\n|//;";

    public static int add(String nums) throws Exception {
        String[] numbers = nums.split(delimeter);

        if(nums.isEmpty()){
            return 0;
        }
        else if (nums.length() == 1){
            return parseInt(nums);
        }
        else {
            return sum(numbers);
        }
    }

    private static int sum(String[] numbers) throws Exception{
        findNegativeNumException(numbers);

        return calculateValues(numbers);
    }

    private static int calculateValues(String[] numbers){
        int total = 0;

        for (String values : numbers){
            if(stringToInt(values) > 1000){
                continue;
            }
            total += stringToInt(values);
        }
        return total;
    }

    private static int sumDelimeter(String[] numbers) throws Exception{
        int sum = 0;

        for (String value : numbers){
            sum += Integer.parseInt(value);
        }

        return sum ;
    }

    private static int stringToInt(String numbers){
        return Integer.parseInt(numbers);
    }

    private static void findNegativeNumException(String[] numbers) throws Exception{
        for (String values : numbers){
            if(stringToInt(values) < 0){
                throw new Exception("Negative number not allowed.");
            }
        }
    }

    private static int differentDeliminters(String[] numbers){
        int sum = 0;

        for (String value : numbers){
            sum += Integer.parseInt(value);
        }

        return sum ;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter numbers seperated by: , or ;");
//        String numbers = sc.nextLine();
//        String numbers = JOptionPane.showInputDialog(null,"Enter numbers seperated by: , or ;");

        System.out.println("A function that can handle up two integers.".toUpperCase() +
                "1,2");
        System.out.print("The Sum Is: ".toUpperCase());
        System.out.println(Calculator.add("1,2"));
        System.out.println("============================================================");
        System.out.println("A function tha can handle multiple integers.".toUpperCase() +
                "1,2,3,4,5");
        System.out.print("The Sum Is: ".toUpperCase());
        System.out.println(Calculator.add("1,2,3,4,5"));
        System.out.println("============================================================");
        System.out.println("A function tha can handle new line between integers.".toUpperCase() +
                "1\n2,3");
        System.out.print("The Sum Is: ".toUpperCase());
        System.out.println(Calculator.add("1\n2,3"));
        System.out.println("============================================================");

//        System.out.println("A function tha can handle different delimiters." +
//                "//4\n142");
//        System.out.print("The Sum Is: ");
//        System.out.println(Calculator.add("//4\n142"));
//        System.out.println("================================================");
    }
}
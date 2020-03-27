import javax.swing.*;
import java.util.Scanner;
import static java.lang.Integer.*;

public class Calculator{
    public static final String delimeter = "//;|,|\n";

    public static int add(String nums) {
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

    public static int sum(String[] numbers) {
        int total = 0;

        for (String values : numbers){
            total += Integer.parseInt(values);
        }

        return total;
    }

    public static int sumDelimeter(String[] numbers) throws Exception{
        int sum = 0;

        for (String value : numbers){

            sum += Integer.parseInt(value);
        }

        return sum ;
    }
    public static int StringToInt(String numbers){
        return Integer.parseInt(numbers);
    }

    public static void findNegativeNumException(String numbers) throws Exception{
        if(Calculator.StringToInt(numbers) < 0){
            throw new Exception("Negative number not allowed!");
        }
    }

    public static void numGreaterThan1000(String numbers){
        if(Calculator.StringToInt(numbers) > 1000){
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter numbers seperated by: , or ;");
//        String numbers = sc.nextLine();
        String numbers = JOptionPane.showInputDialog(null,"Enter numbers seperated by: , or ;");

        System.out.println(Calculator.add(numbers));
    }
}
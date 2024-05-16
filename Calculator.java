import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        //creat a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
//prompt the user for an experession
        System.out.println("enter an experession(e.g , 5+10):");
        String input = scanner.nextLine();

        try {
            //parse the input to exract number and the operator
            String[] parts = input.split("  ");
            double num1 = Double.parseDouble(parts[0]);
            String operetor = parts[1];
            double num2 = Double.parseDouble(parts[2]);
            //perform the selected operator
            double result = 0;
            switch (operetor) {
                case "+":
                    result =num1+num2;
                    break;
                case "-":
                    ;
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    ;
                    if (num2 == 0) {
                        System.out.println("error :division by zero");

                        return;

                    }
                    result = num1 / num2;
                    break;
                default:

                    System.out.println("invalid operetor!");
                    return;
            }
            //display the result with approprait formating
            System.out.println("result:" + input + "=" + result);

        } catch (NumberFormatException e) {
            System.out.println("invalid input format !");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid experession format . use ' number operator number '.");



        }        //*name, feroz ali
                 //* roll no, 2k23\CSME\15
    }
    }
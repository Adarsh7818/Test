import java.util.*;
public class stringtonum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        int number = convertStringToNumber(str);
        System.out.println("The converted number is: " + number);
    }
    public static int convertStringToNumber(String str){

        int number = 0;
        int length = str.length();

        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                number = number * 10 + (c - '0');
            } else {
                throw new NumberFormatException("Invalid character in string: " + c);
            }
        }
        return number;
    }
    
}

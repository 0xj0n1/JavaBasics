import java.util.Scanner;
public class ReverseAString{
    public static void main(String[] args){
        String reversedString = "";
        String input_string;

        Scanner scanner = new Scanner(System.in);
        input_string = scanner.nextLine();

        char[] string_array = input_string.toCharArray();

        for(int i = string_array.length-1; i>=0; i--){
            reversedString+=string_array[i];
        }


System.out.println(reversedString);

    }
}

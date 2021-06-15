import java.util.Scanner;
public class Variable {
    public static void main(String[] args){
    String name =  "Info";
    int zahl1 = 5;
    double zahl2 = 59.89;
    char c = 'L';
    int usereingabe;
    Scanner input = new Scanner(System.in);
    usereingabe = input.nextInt();
    int ergebnis = zahl1 + usereingabe;
    int ergebnis2 = usereingabe % zahl1;
    final double PI = 3.14159;

    System.out.println(name);
    System.out.println(zahl2);
    System.out.println(c);
    System.out.println(ergebnis);
    System.out.println(ergebnis2);
    System.out.println(PI);


    }        
}

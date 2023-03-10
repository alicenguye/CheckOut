import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double total = 0;
        boolean yn =true;
        do {
            total += SafeInput.getRangedDouble(in, "Enter item price ", 9.99, 0.50);
            yn = SafeInput.getYNConfirm(in, "Do you want to add more items ");
        }while(!yn);
        System.out.printf("Total Price: " +"%.2f",total);
    }
}
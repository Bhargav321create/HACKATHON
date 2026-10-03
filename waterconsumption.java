import java.util.Scanner;
public class waterconsumption {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double consumption=sc.nextDouble();
        if (consumption<500) {
            System.out.println("Water bill = 100");
        } else {
            System.out.println("Water bill is = 200");
        }
    }
}
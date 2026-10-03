import java.util.Scanner;
public class Household{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int numberOfMembers=sc.nextInt();
        double waterconsumption=sc.nextInt();
        int housenumber=sc.nextInt();
        char status=sc.next().charAt(0);
        System.out.println("Details of Household");
        System.out.println("Number of Members:"+numberOfMembers);
        System.out.println("Water consumption:"+waterconsumption);
        System.out.println("House number:"+housenumber);
        System.out.println("Status:"+status);

    }
}
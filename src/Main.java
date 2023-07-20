import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name :");
        String name = input.nextLine();
        System.out.println("Please enter your number :");
        int number = input.nextInt();
        input.nextLine();
        System.out.println("Please enter your hobbies :");
        String hobbies = input.nextLine();
        System.out.println("Please enter your college :");
        String college = input.nextLine();
        System.out.println("Please enter your result :");
        double result = input.nextDouble();
        String status;
        if (result == 100)
            status = "Full mark";
        else if (result >= 80 && result <= 99)
            status = "Excellent";
        else if (result >= 60 && result <= 79)
            status = "Very good";
        else if (result >= 50 && result <= 59)
            status = "good";
        else if (result >= 0 && result <= 49)
            status = "Fail";
        else
            status = "Wrong result";

        System.out.println("Hi "+name + "," +
                "\nYour number : "+number+
                "\nYour hobbies : "+hobbies+
                "\nYour college : "+college+
                "\nYour result : "+result+
                "\nYour status : "+status);
    }


}

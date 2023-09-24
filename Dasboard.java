import java.util.Scanner;

public class Dasboard {
    public void dasboard ()
    {
        Faculty_info o1 = new Faculty_info();
        System.out.println("WELCOME TO FACULTY FEEDBACK SYSTEM");
        System.out.println("1: FACULTY INFORMATION");
        System.out.println("2: FACULTY FEEDBACK");
        System.out.println("3: FACULTY RATINGS");
        System.out.println("4: EXIT");
        System.out.println("ENTER YOUR CHOICE: ");
        Scanner sc =new Scanner(System.in);
        int choice=sc.nextInt();
        System.out.println(choice);
        switch (choice)
        {
            case 1:
                o1.view_name();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }
}
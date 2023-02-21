package dogs.com;

import java.util.Scanner;
public class doggrab { public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a dog's name: ");
        String Dname1 = scan.nextLine();
        System.out.println("Enter its age: ");
        Integer Dage1 = scan.nextInt();
        dog dog1 = new dog(Dage1, Dname1);

        System.out.println("Enter a dog's name: ");
        scan.nextLine();
        String Dname2 = scan.nextLine();
        System.out.println("Enter its age: ");
        Integer Dage2 = scan.nextInt();
        dog dog2 = new dog(Dage2, Dname2);
        scan.nextLine();

        System.out.println("Enter a dog's name: ");
        String Dname3 = scan.nextLine();
        System.out.println("Enter its age: ");
        Integer Dage3 = scan.nextInt();
        dog dog3 = new dog(Dage3, Dname3);
        scan.nextLine();

        System.out.println("Enter a dog's name: ");
        String Dname4 = scan.nextLine();
        System.out.println("Enter its age: ");
        Integer Dage4 = scan.nextInt();
        dog dog4 = new dog(Dage4, Dname4);
        scan.nextLine();

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);



}
}
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);

        System.out.println("Your age: ");
        int age = sc.nextInt();
        System.out.println("You are " + age);

        sc.nextLine();

        System.out.println("Your DOB");
        String dob = sc.nextLine();
        System.out.println("Your birthday is " + dob);

        String filename = "bio.txt";
        //FileWriter fw = new FileWriter(filename);
        //fw.write(name + " " + age + " " + dob);
        //fw.close();
        try (FileWriter fw = new FileWriter(filename)) {
            fw.write(name + ", " + age + ", " + dob);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        FileReader fr = null;
        try {
            fr = new FileReader(filename);
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
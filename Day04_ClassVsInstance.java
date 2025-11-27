import java.io.*;
import java.util.*;

public class Person {
    private int age;

    /*
     * Constructor: Person
     * Purpose: Initializes the age variable.
     * Check: If initialAge is negative, set age to 0 and print error message.
     */
    public Person(int initialAge) {
        if (initialAge < 0) {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            this.age = initialAge;
        }
    }

    /*
     * Method: amIOld
     * Purpose: Determines the age group of the person.
     * Logic:
     * - < 13: Young
     * - >= 13 and < 18: Teenager
     * - Otherwise: Old
     */
    public void amIOld() {
        if (this.age < 13) {
            System.out.println("You are young.");
        } else if (this.age >= 13 && this.age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    /*
     * Method: yearPasses
     * Purpose: Increments the age of the person by 1.
     */
    public void yearPasses() {
        this.age++;
    }

    // Main method to handle input and test the logic (Provided by HackerRank)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}

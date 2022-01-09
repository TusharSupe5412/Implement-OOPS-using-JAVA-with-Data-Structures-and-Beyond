package myPackage1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyClass1 {
    public static void main(String[] args) throws IOException {
        int score = 0 , ans;
        String name;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name :");
        name = obj.nextLine();

        System.out.println("Q1. Biggest sea animal");
        System.out.println("1.Sea horse   2. Blue whale   3. Shark    4. Hippo");
        System.out.println("Enter your ans");
        ans = obj.nextInt();
        if (ans == 2)
            score = score+20;

        System.out.println("Q2. Biggest land animal");
        System.out.println("1.Elephant   2. Giraffe   3. Rhino    4. Hippo");
        System.out.println("Enter your ans");
        ans = obj.nextInt();
        if (ans == 1)
            score = score+20;

        System.out.println("Q3. Fastest bird");
        System.out.println("1.Egle   2. Parrot   3. Falcon    4. Crow");
        System.out.println("Enter your ans");
        ans = obj.nextInt();
        if (ans == 3)
            score = score+20;

        System.out.println("Q4. Fastest land animal");
        System.out.println("1.Elephant   2. Giraffe   3. Cheetah    4. Hippo");
        System.out.println("Enter your ans");
        ans = obj.nextInt();
        if (ans == 1)
            score = score+20;

        System.out.println("Q5. Which is pet animal");
        System.out.println("1.Dog   2. Giraffe   3. Rhino    4. Hippo");
        System.out.println("Enter your ans");
        ans = obj.nextInt();
        if (ans == 1)
            score = score+20;

        FileWriter fw = new FileWriter("D:\\Codes\\Module2\\Student\\Scores.txt", true);
        fw.write(name+ ","+score+"\n");

        System.out.println("Your score is stored. Thank you for taking quiz");
        fw.close();
        obj.close();
    }
}

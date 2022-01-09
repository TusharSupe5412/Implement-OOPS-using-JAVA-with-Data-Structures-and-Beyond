package myPackage2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class MyClass2 {
    public static void main(String[] args) throws IOException {
        String name;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Students name: ");
        name = obj.nextLine();
        boolean isFound = false;

        var result = Files.readAllLines(Paths.get("D:\\Codes\\Module2\\Student\\Scores.txt"));

        for (var r : result) {
            var data = r.split(",");
            if (name.equalsIgnoreCase(data[0])) {
                System.out.println("score=" + data[1]);
                isFound = true;
                break;
            }
        }
        if (isFound == false) {
            System.out.println("name not found");
        }
    }
}

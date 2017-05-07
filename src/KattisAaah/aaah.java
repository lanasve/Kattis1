package KattisAaah;

import java.util.Scanner;

public class aaah {
        public static void main(String[] args) {
            Scanner scaner = new Scanner(System.in);

            String first = scaner.next();
            String second = scaner.next();

            if (first.length() >= second.length())
                System.out.println("go");
            else
                System.out.println("no");

            scaner.close();
        }

}

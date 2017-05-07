package apaxiaaans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class apaxiaaans {

    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String name = read.readLine();

        System.out.println(name.replaceAll("(.)\\1{1,}", "$1"));
    }
}
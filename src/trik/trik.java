package trik;

import java.lang.System;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class trik {

    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String trik = reader.readLine();

        char[]line = trik.toCharArray();


        char rightcup = 'A';

        for (int i = 0; i < line.length; i++){
            if (line[i] == 'A'){
                if(rightcup == 'A'){
                    rightcup = 'B';
                }
                else if(rightcup == 'B'){
                    rightcup = 'A';
                }
            }
            else if (line[i] == 'B'){
                if(rightcup == 'C'){
                    rightcup = 'B';
                }
                else if(rightcup == 'B'){
                    rightcup = 'C';
                }
            }
            else if (line[i] == 'C'){
                if(rightcup == 'A'){
                    rightcup = 'C';
                }
                else if(rightcup == 'C'){
                    rightcup = 'A';
                }
            }
        }
        int m=0;
        switch (rightcup){
            case 'A': m=1;
                break;
            case 'B': m=2;
                break;
            case 'C': m=3;
                break;
        }
        System.out.println(m);
    }
}

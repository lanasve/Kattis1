package SortOfSorting;
import com.sun.org.apache.xpath.internal.SourceTree;

        import  java.io.IOException;
        import  java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.ArrayList;
        import java.util.Collection;
        import java.util.Collections;

public class sortOfSorting {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        ArrayList<String> students = new ArrayList<>();

        while (number!=0){

            String[] inputName = new String[number];

            for (int i = 0; i < number; i++) {
                inputName[i] = reader.readLine();
            }
            String mellan;
            char letter1, letter2, letter21, letter22;
            for(int i=0; i<number; i++) {
                letter1 = inputName[i].charAt(0);
                letter2 = inputName[i].charAt(1);
                for(int j=0; j<i; j++){
                    letter21=inputName[j].charAt(0);
                    letter22 =inputName[j].charAt(1);
                    if(letter1<letter21)
                    {
                        mellan=inputName[i];
                        inputName[i] = inputName[j];
                        inputName[j] = mellan;
                    }
                    if (letter1==letter21 && letter2<letter22)
                    {
                        mellan=inputName[i];
                        inputName[i] = inputName[j];
                        inputName[j] = mellan;
                    }
                }

            }
            for (int i=0; i<number; i++){
                System.out.println(inputName[i]);
            }
            System.out.println();
            Collections.addAll(students, inputName);
            number = Integer.parseInt(reader.readLine());

        }
    }
}
package acm;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class acm {

    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String log = read.readLine();


        int solved = 0;
        int time = 0;
        ArrayList<String> logs = new ArrayList<String>();


        while(!(log.equals("-1"))){

            String[] data = log.split(" ");


            if(data[2].equals("right")){
                solved++;

                String letter = data[1];
                int tempTime = Integer.parseInt(data[0]);


                for(int i = 0; i < logs.size(); i++){
                    if(logs.get(i).split(" ")[1].equals(letter)){
                        tempTime += 20;
                    }
                }
                time += tempTime;
            }

            logs.add(log);
            log = read.readLine();
        }
        System.out.println(solved + " " + time);
    }
}

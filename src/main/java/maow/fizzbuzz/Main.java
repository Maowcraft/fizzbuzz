package maow.fizzbuzz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int total = 100;
        int f = 3;
        int b = 5;
        for (int i = 0; i <= args.length; i++) {
            switch(i) {
                case 1:
                    total = Integer.parseInt(args[0]);
                    break;
                case 2:
                    f = Integer.parseInt(args[1]);
                    break;
                case 3:
                    b = Integer.parseInt(args[2]);
                    break;
                default:
                    break;
            }
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("fizzbuzz.txt"));
        for (int i = 1; i <= total; i++) {
            String output = "";
            if (i % f == 0) {
                output += "Fizz";
            }
            if (i % b == 0) {
                output += "Buzz";
            }
            if (output.equals("")) {
                output = String.valueOf(i);
            }
            System.out.println(output);
            writer.write(output);
            if (i != total) {
                writer.newLine();
            }
        }
        writer.flush();
        writer.close();
    }
}

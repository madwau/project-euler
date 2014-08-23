import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem022 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> names = new ArrayList<String>();
        Scanner in = new Scanner(new FileReader("names.txt")).useDelimiter(",");

        while (in.hasNext())
            names.add(in.next());

        Collections.sort(names);

        int total = 0;
        int n = 1;

        for (String s : names) {
            for (int i = 1; i < s.length() - 1; i++) {
                total += n * (s.charAt(i) - 'A' + 1);
            }

            n++;
        }

        System.out.println(total);
    }
}
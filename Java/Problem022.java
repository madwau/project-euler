import java.util.Collections;
import java.util.List;

public class Problem022 {
    public static void main(String[] args)  {
        List<String> names = Helper.getItems("names.txt");
        Collections.sort(names);

        int total = 0, n = 1;

        for (String s : names) {
            for (int i = 0; i < s.length(); i++) {
                total += n * (s.charAt(i) - 'A' + 1);
            }

            n++;
        }

        System.out.println(total);
    }
}
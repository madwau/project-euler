import java.util.Calendar;

public class Problem019 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(1901, 1, 1);

        int count = 0;

        while(c.get(Calendar.YEAR) < 2001) {
            if (c.get(Calendar.DAY_OF_MONTH) == 1 &&
                c.get(Calendar.DAY_OF_WEEK)  == Calendar.SUNDAY) {
                count++;
            }

            c.add(Calendar.DATE, 1);
        }

        System.out.println(count);
    }
}
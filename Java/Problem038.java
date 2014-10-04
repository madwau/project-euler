public class Problem038 {
    public static void main(String[] args) {
        int max = 0;

        for (Integer i = 1; i < 10000; i++) {
            String pan = "";

            for (int j = 1; pan.length() < 9; j++) {
                pan += String.valueOf(i * j);

                if (!pan.contains("0") && pan.length() == 9 && unique(pan) && Integer.parseInt(pan) > max) {
                    max = Integer.parseInt(pan);
                }
            }
        }

        System.out.println(max);
    }

    public static boolean unique(String s) {
        String tmp = "";

        for (int i = 0; i < s.length(); i++) {
            if (tmp.contains(s.substring(i, i + 1)))
                return false;
            tmp += s.substring(i, i + 1);
        }

        return true;
    }
}
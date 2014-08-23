public class Problem017 {
    public static void main(String[] args) {
        String num1 = "onetwothreefourfivesixseveneightnine";
        String num2 = "teneleventwelvethirteenfourteenfifteensixteenseventeeneighteennineteen";
        String num3 = "twentythirtyfortyfiftysixtyseventyeightyninety";
        String num4 = "hundredand";
        String num5 = "onethousand";

        System.out.println(10*(9*num1.length() + 10* num3.length() + num2.length()) + 100*num1.length() + 900*num4.length() - 9*3 + num5.length());
    }
}
public class Problem042 {
    public static void main(String[] args) {
        int count = 0;
        
        for(String word : Helper.getItems("words.txt")) {
            if(Helper.triangleNumbers(100).contains(Helper.sumOfLetters(word))) count++;
        }
        
        System.out.println(count);
    }
}
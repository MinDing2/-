import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordNum = scanner.nextLine().trim(); // remove leading/trailing spaces
        
        if (wordNum.isEmpty()) { // check if input is empty
            System.out.println(0);
        } else {
            String[] words = wordNum.split("\\s+"); // split input by whitespace
            System.out.println(words.length);
        }
    }
}

import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String st = sc.nextLine();

        boolean[] alphabet = new boolean[26];
        int i = 0;
        int flag = 1;
        for (int k = 0; k < st.length(); k++) {
            if (st.charAt(k) >= 'A' && st.charAt(k) <= 'Z') {
                i = st.charAt(k) - 'A';
            } else if (st.charAt(k) >= 'a' && st.charAt(k) <= 'z') {
                i = st.charAt(k) - 'a';
            }
            alphabet[i] = true;
        }
        for (int j = 0; j <= 25; j++) {
            if (alphabet[j] == false)
                flag = 0;
        }
        System.out.print("String: " + st);
        System.out.println();
        if (flag == 1)
            System.out.print("The above string is a pangram.");
        else
            System.out.print("The above string is not a pangram.");
    }

}

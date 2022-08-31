import java.util.Scanner;

public class Main {

    static char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',};

    public static int findIndex(char letter) {
        for (int j = 0; j < alphabet.length; j++) {
            if (alphabet[j] == letter) {
                return j;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        var scan = new Scanner(System.in);
        StringBuilder finalText = new StringBuilder();

        System.out.println("Input your text");
        String text = scan.nextLine();
        int k;

        do {
            System.out.println("Input secret key");
            k = scan.nextInt();
        } while (!((k > 0) & (k < 26)));

        for (int i = 0; i < text.length(); i++) {
            char pi = text.charAt(i);
            
            if (pi == ' ') {
                finalText.append(" ");
            } else  {
                if (findIndex(pi) + k >= 26) {
                    finalText.append(alphabet[findIndex(pi) + k - 26]);
                } else {
                    finalText.append(alphabet[findIndex(pi) + k]);
                }
            }
        }

        System.out.println("Here is your coded text");
        System.out.println(finalText);
    }
}
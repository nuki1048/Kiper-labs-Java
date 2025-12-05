import java.util.Scanner;

class LabPalindrome {

    LabPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Будь ласка, введіть слово: ");
        String s = sc.nextLine();

        if(!checkOnlyLatin(s)) {
            System.out.println("Помилка: слово має містити лише латинські літери.");
            return;
        }

        if(isPalindrome(s)) System.out.println("YES");
        else System.out.println("NO");
    }

    boolean checkOnlyLatin(String s) {
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')))
                return false;
        }
        return true;
    }

    // Нормалізуємо символ, не створюючи нові рядки
    char normalize(char c) {
        if(c >= 'A' && c <= 'Z') return (char)(c + 32); // робимо маленьку літеру
        return c;
    }

    boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i < j) {
            char left = normalize(s.charAt(i));
            char right = normalize(s.charAt(j));

            if(left != right) return false;

            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        new LabPalindrome();
    }
}

import java.util.Scanner;

class Lab3ATM {

    public Lab3ATM() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t\tЛабораторна робота №3");

        while(true) {
            System.out.print("\nВведіть суму (1–9999) або q для виходу: ");
            String s = sc.nextLine();
            if(s.equalsIgnoreCase("q")) System.exit(0);

            int amount = Integer.parseInt(s);

            if(amount < 1 || amount > 9999) {
                System.out.println("Сума поза допустимим діапазоном!");
                continue;
            }

            System.out.print("Введіть валюту (UAH / USD / EUR / ILS): ");
            String cur = sc.nextLine().toUpperCase();

            printResult(amount, cur);
        }
    }

    void printResult(int amount, String currency) {
        String words = numberToWords(amount);
        String curCase = currencyCase(amount, currency);

        if(curCase == null) {
            System.out.println("Невідома валюта!");
            return;
        }

        System.out.println("\n" + amount + " – " + words + " " + curCase);
    }

    // =====================================================
    //   Перетворення числа у слова
    // =====================================================

    String numberToWords(int n) {
        String[] units = {
                "", "один", "два", "три", "чотири", "п'ять",
                "шість", "сім", "вісім", "дев'ять"
        };

        String[] unitsFeminine = {
                "", "одна", "дві"
        };

        String[] teens = {
                "десять", "одинадцять", "дванадцять", "тринадцять",
                "чотирнадцять", "п'ятнадцять", "шістнадцять",
                "сімнадцять", "вісімнадцять", "дев'ятнадцять"
        };

        String[] tens = {
                "", "", "двадцять", "тридцять", "сорок",
                "п'ятдесят", "шістдесят", "сімдесят",
                "вісімдесят", "дев'яносто"
        };

        String[] hundreds = {
                "", "сто", "двісті", "триста", "чотириста",
                "п'ятсот", "шістсот", "сімсот", "вісімсот",
                "дев'ятьсот"
        };

        StringBuilder sb = new StringBuilder();

        int thousand = n / 1000;
        int hundred = (n % 1000) / 100;
        int ten = (n % 100) / 10;
        int unit = n % 10;

        // ---- thousands ----
        if(thousand > 0) {
            if(thousand == 1) sb.append("одна тисяча ");
            else if(thousand == 2) sb.append("дві тисячі ");
            else sb.append(units[thousand]).append(" тисячі ");
        }

        // ---- hundreds ----
        if(hundred > 0) sb.append(hundreds[hundred]).append(" ");

        // ---- tens and units ----
        if(ten == 1) {
            sb.append(teens[unit]); // 10–19
        } else {
            if(ten > 1) sb.append(tens[ten]).append(" ");
            if(unit > 0) sb.append(units[unit]);
        }

        return sb.toString().trim();
    }


    // =====================================================
    //   Правильний відмінок валюти
    // =====================================================

    String currencyCase(int n, String cur) {
        int lastTwo = n % 100;
        int last = n % 10;

        boolean plural = (lastTwo >= 11 && lastTwo <= 14);

        switch(cur) {

            case "USD":
                if(plural) return "доларів";
                if(last == 1) return "долар";
                if(last >= 2 && last <= 4) return "долари";
                return "доларів";

            case "UAH":
                if(plural) return "гривень";
                if(last == 1) return "гривня";
                if(last >= 2 && last <= 4) return "гривні";
                return "гривень";

            case "ILS": // додано шекелі
                if(plural) return "шекелів";
                if(last == 1) return "шекель";
                if(last >= 2 && last <= 4) return "шекелі";
                return "шекелів";

            case "EUR":
                return "євро"; // незмінювана форма
        }

        return null;
    }

    public static void main(String[] args) {
        new Lab3ATM();
    }
}

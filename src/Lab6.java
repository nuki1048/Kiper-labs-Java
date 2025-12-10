import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Lab6 {

    int argc;

    Lab6() {
        this(new Scanner(System.in).nextLine().split(" "));
    }

    Lab6(String[] args) {

        argc = args.length;

        printUserArgs(args); // <-- НОВОЕ

        if (argc == 0) {
            printDescription();
        } else {
            System.out.println("\n=== Результат обробки ваших аргументів ===");
            handleArguments(args);
        }

        // --- Нове ТЗ ---
        processUserName();
        processBirthday();
        processVariantInput();
    }

    void printUserArgs(String[] args) {
        System.out.println("Користувач ввів аргументи:");

        if (args.length == 0) {
            System.out.println("\t(аргументів немає)");
            return;
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println("\t[" + i + "] → " + args[i]);
        }
        System.out.println();
    }

    void handleArguments(String[] args) {
        for (int i = 0; i < argc; i++) {

            switch (args[i].toLowerCase()) {

                case "--rnd":
                    if (argsCountCheck(i + 1, 1)) {
                        int count = parseInt(args[i + 1]);
                        if (count >= 0) {
                            System.out.println("\n--rnd: генерація чисел в одному рядку:");
                            printRandomInline(count);
                        }
                        i++;
                    }
                    break;

                case "--rndln":
                    if (argsCountCheck(i + 1, 1)) {
                        int count = parseInt(args[i + 1]);
                        if (count >= 0) {
                            System.out.println("\n--rndln: генерація чисел пострічково:");
                            printRandomNewline(count);
                        }
                        i++;
                    }
                    break;

                case "--help":
                default:
                    printDescription();
                    break;
            }
        }
    }

    void printRandomInline(int n) {
        Random rnd = new Random();
        System.out.print("\t");
        for (int i = 0; i < n; i++) {
            System.out.print(rnd.nextInt(100) + " ");
        }
        System.out.println();
    }

    void printRandomNewline(int n) {
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            System.out.println("\t" + rnd.nextInt(100));
        }
    }

    boolean argsCountCheck(int argPos, int count) {
        if ((argc - argPos) < count) {
            printDescription();
            return false;
        }
        return true;
    }

    int parseInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            System.out.println("\tПомилка: \"" + s + "\" не є числом.");
            return -1;
        }
    }

    void printDescription() {
        System.out.println(
                "\nСинтаксис запуску програми:\n" +
                        "\n\tProgName <key> <count>\n" +
                        "\n<key> :=\n" +
                        "\t--rnd    \tвивести випадкові числа в одному рядку\n" +
                        "\t--rndln  \tвивести випадкові числа кожне в новому рядку\n" +
                        "\t--help   \tвивести цю підказку\n"
        );
    }


    void processUserName() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nВведіть ім'я: ");
        String name = sc.nextLine();

        System.out.print("Введіть прізвище: ");
        String surname = sc.nextLine();

        System.out.println("\nВітаю, " + name + " " + surname + "!");
    }

    void processBirthday() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть дату народження (формат: dd.MM.yyyy): ");

        String dateStr = sc.nextLine();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        try {
            LocalDate birth = LocalDate.parse(dateStr, fmt);
            LocalDate today = LocalDate.now();

            LocalDate nextBirthday = birth.withYear(today.getYear());

            if (nextBirthday.isBefore(today)) {
                nextBirthday = nextBirthday.plusYears(1);
            }

            long daysLeft = ChronoUnit.DAYS.between(today, nextBirthday);

            if (daysLeft == 0) {
                System.out.println("🎉 Вітаємо з днем народження! 🎉");
            } else {
                System.out.println("До дня народження залишилося: " + daysLeft + " днів.");
            }

        } catch (Exception e) {
            System.out.println("Невірний формат дати!");
        }
    }

    void processVariantInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nВведіть будь-яке число (логіка варіанта може бути розширена): ");
        try {
            int val = Integer.parseInt(sc.nextLine());
            System.out.println("Ви ввели число: " + val);
        } catch (Exception e) {
            System.out.println("Це не число.");
        }
    }

    static {
        System.out.println("Лабораторна робота №6:");
    }

    public static void main(String[] args) {
        new Lab6(args);
    }
}

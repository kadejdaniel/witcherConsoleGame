import java.util.Scanner;

public class Game {
    private Witcher witcher;
    private Monster wolf = new Monster("Wilk", 30, 5);
    private Monster drowner = new Monster("Utopiec", 50, 8);
    private Monster griffin = new Monster("Gryf", 120, 15);


    void pickYourDestiny() {
        Scanner in = new Scanner(System.in);

        System.out.println("Witaj graczu, podaj swoje imię: ");
        String name = in.nextLine();

        System.out.println("Witaj wiedźminie o imieniu " + name + ". Wybierz do jakiego cechu chcesz należeć:");
        System.out.println("1 - cech Wilka");
        System.out.println("2 - cech Kota");
        System.out.println("3 - cech Mantikory");
        System.out.println("4 - cech Gryfa");

        int choice = in.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Wybrałeś cech Wilka – równowaga.");
                witcher = new Witcher(3, 2, 2, 3, name, 100, 500, 1, 0, 1, 1, 1);
            }
            case 2 -> {
                System.out.println("Wybrałeś cech Kota – zwinność/agresja.");
                witcher = new Witcher(3, 1, 1, 5, name, 100, 500, 1, 0, 1, 1, 1);
            }
            case 3 -> {
                System.out.println("Wybrałeś cech Mantikory – alchemia.");
                witcher = new Witcher(1, 2, 6, 1, name, 100, 500, 1, 0, 1, 1, 1);
            }
            case 4 -> {
                System.out.println("Wybrałeś cech Gryfa – znaki/magia.");
                witcher = new Witcher(2, 5, 2, 1, name, 100, 500, 1, 0, 1, 1, 1);
            }
            default -> {
                System.out.println("Nieznany wybór. Ustawiam Wilka.");
                witcher = new Witcher(3, 2, 2, 3, name, 100, 500, 1, 0, 1, 1, 1);
            }
        }

        witcher.showStats();
    }

    void menu() {
        boolean game = true;
        while (game) {
            System.out.println("Wybierz co chcesz zrobic: ");

            System.out.println("1 - Przespanie się w tawernie");
            System.out.println("2 - Kupienie dodatkowej mikstury leczniczej");
            System.out.println("3 - Walka z przeciwnikiem prostym");
            System.out.println("4 - Walka z przeciwnikiem trudnym");
            System.out.println("5 - Walka z finałowym przeciwnikiem");
            System.out.println("6 - Karczmarz");
            System.out.println("0 - Sprawdź aktualne statystyki");
            System.out.println("9 - wyjscie z gry");

            System.out.print("Wybierz opcję: ");

            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();

            switch (choice) {
                case 1 -> {
                    witcher.sleepInTavern();
                }
                case 2 -> {
                    witcher.buyPotion();
                }
                case 3 -> {
                    witcher.fight(wolf);
                }
                case 4 -> {
                    witcher.fight(drowner);
                }
                case 5 -> {
                    witcher.fight(griffin);
                }
                case 6 ->{
                    witcher.karczma();
                }
                case 0 -> {
                    witcher.showStats();
                }
                case 9 -> {
                    game = false;
                }
            }
        }
    }
}

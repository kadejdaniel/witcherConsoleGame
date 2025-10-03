import java.util.Scanner;

public class Character {
    int hp;
    int korony;
    int level;
    int exp;
    int potionJaskolka;
    int potionKot;
    int potionWilga;
    String name;


    public Character() {
    }

    ;

    public Character(int hp, int korony, int level, int exp, int potionJaskolka, int potionKot, int potionWilga, String name) {
        this.hp = hp;
        this.korony = korony;
        this.level = level;
        this.exp = exp;
        this.potionJaskolka = potionJaskolka;
        this.potionKot = potionKot;
        this.potionWilga = potionWilga;
        this.name = name;
    }

    public void showStats() {
        System.out.println("Oto twoje statystyki " + name);
        System.out.println("Aktualne HP: " + hp);
        System.out.println("Aktualny poziom: " + level);
        System.out.println("Ilość koron: " + korony);
        System.out.println("Poziom bohatera " + level);
        System.out.println("Ilość mikstur: ");
        System.out.println("Jaskolka: " + potionJaskolka);
        System.out.println("Kot " + potionKot);
        System.out.println("Wilga " + potionWilga);
    }


    public void sleepInTavern() {
        int maxhp = 100;
        hp = maxhp;
        System.out.println("Przespales sie w tawernie, odnowiłeś zdrowie");
    }

    public void buyPotion() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ktora miksture chcesz kupic");
        System.out.println("1.Jaskolka - 100");
        System.out.println("2.Kot - 200");
        System.out.println("3.Wilga - 300");
        int choice = in.nextInt();

        if (choice == 1 && korony >= 100) {
            System.out.println("Zakupiłeś miksture Jaskolke.");
            potionJaskolka += 1;
            korony -= 100;
        } else if (choice == 2 && korony >= 200) {
            System.out.println("Zakupiłeś miksture Kot.");
            potionKot += 1;
            korony -= 200;
        } else if (choice == 3 && korony >= 300) {
            System.out.println("Zakupiłeś miksture Wilge.");
            potionWilga += 1;
            korony -= 300;
        } else {
            System.out.println("Nie masz wystarczajaco koron. Stan wynosi: " + korony);
        }

    }

    public void takeDamage(int dmg) {
        hp -= dmg;
    }

    public void takeReward() {
        exp += 100;
        korony += 100;
    }

    public int getHp() {
        return hp;
    }
}



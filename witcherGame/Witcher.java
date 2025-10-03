import java.util.Random;
import java.util.Scanner;

public class Witcher extends Character {
    int strength;
    int magic;
    int alchemy;
    int agility;


    public Witcher(int strength, int magic, int alchemy, int agility,String name, int hp, int korony, int level,int exp,int potionJaskolka, int potionKot,int potionWilga) {

        super(hp, korony, level, exp, potionJaskolka, potionKot, potionWilga, name);

        this.strength = strength;
        this.magic = magic;
        this.alchemy = alchemy;
        this.agility = agility;
    }
    int getDmg(int dmg){
        hp -=dmg;
        return dmg;
    }
    void fight(Monster monster) {
        Random rand = new Random();
        boolean startFight = true;
        int randomN = rand.nextInt(10);
        String [] dialog = {
                monster.name + " ugryzł cię!",
                monster.name + " trafił krytycznie!",
                monster.name + " przewrócił cię na ziemię!",
                monster.name + " zawył, dezorientując cię!"
        };


        System.out.println("Walczysz przeciwko potworowi o nazwie: " + monster.name);
        System.out.println("Jego statystyki to: " + monster.showStats() );
        System.out.println("Czy jestes pewien ze chcesz stoczyć walke przeciwko niemu? ");
        System.out.println("1 - TAK 2 - NIE");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();


        int index = rand.nextInt(dialog.length);
        if (choice == 1 ){
            System.out.println("Rozpoczynasz walke z " + monster.name);
            while(getHp() > 0 && monster.getHp() >0) {
                int aktHpPotwor = monster.getHp();
                int aktHpWitcher = getHp();
                System.out.println(monster.name + "otrzymal obrazenia w wysokości " + monster.getDmg(randomN) + " zdrowie wynosi: " + monster.getHp());
                pause(1000);
                System.out.println(name + " - " + dialog[rand.nextInt(dialog.length)] + "Otrzymałeś obrazenia w wysokosci: " + getDmg(randomN) + " Zdrowie" + getHp());
            }
        }


    }

    private void pause(int i) {
    }


}



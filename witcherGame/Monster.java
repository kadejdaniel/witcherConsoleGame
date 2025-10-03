public class Monster {
    int hp;
    int level;
    String name;

    public Monster(String name, int level, int hp) {
        this.hp = hp;
        this.level = level;
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public int getDmg(int dmg) {
        hp -= dmg;
        return dmg;
    }

    public void takeDmg(int dmg) {
        hp -= dmg;
    }

    public boolean showStats() {
        System.out.println("Nazwa: " + getName());
        System.out.println("hp: " + getHp());
        System.out.println("Poziom: " + getLevel());

        return false;
    }
}

package boxing;

import java.util.Random;

public class boxer {
    String name;
    int damage;
    int hp;
    int missRate;


    int decreaseHP(int damage) {
        this.hp -= damage;
        return this.hp;
    }

    public boxer(String name, int damage, int hp, int missRate) {
        this.name = name;
        this.damage = damage;
        this.hp = hp;
        this.missRate = missRate;
    }

    void hit(boxer b) {
        Random r = new Random();
        this.missRate = r.nextInt(100);
        if(b.missRate > 90) {
            System.out.println(this.name + " đã đấm trướt " + b.name);
        }else {
            b.decreaseHP(this.damage);
            System.out.println(this.name + " HP " + this.hp + " Miss " + this.missRate);
            System.out.println(b.name + " HP " + b.hp + " Miss " + b.missRate);
        }
    }
}

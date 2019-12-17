package T3H.GameRescueThePrincess;

public class Dragon {
    private int HP = 1000;
    private int armor = 30;
    private int antiMagical = 20; //%

    private int crit = 20; // %
    private int damage = 100;

    public Dragon() {

    }

    public Dragon(int HP, int armor, int antiMagical, int crit, int damage) {
        this.HP = HP;
        this.armor = armor;
        this.antiMagical = antiMagical;
        this.crit = crit;
        this.damage = damage;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getAntiMagical() {
        return antiMagical;
    }

    public void setAntiMagical(int antiMagical) {
        this.antiMagical = antiMagical;
    }

    public int getCrit() {
        return crit;
    }

    public void setCrit(int crit) {
        this.crit = crit;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int totalDame(Hero hero)  {
        int number = Constant.random.nextInt(10);
        if(number < 2) {
            return this.damage * 2;
        }
        return this.damage;
    }

//    public void decreaseHPMagical(int damaMagical) {
//        int trueDame = (int)(damaMagical*0.8);
//        this.HP -= trueDame;
//    }
//
//    public void decreaseHPPhysical(int damePhysical) {
//        int trueDame = (int)(damePhysical*0.7);
//        this.HP -= trueDame;
//    }

    public void decreaseHP(int damage, int type) {
        int trueDame = 0;
        if(type == Constant.DAME_PHYSICAL) {
            trueDame -= (int)(damage*0.8);
        }else {
            trueDame -= (int)(damage*0.7);
        }
        System.out.println("Máu hiên tại của Dragon MANAX là " + this.HP);
    }
}



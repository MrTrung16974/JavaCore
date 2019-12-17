package T3H.GameRescueThePrincess;

public class Hero {
    protected String name;
    protected int HP = 500;
    protected int Damege = Constant.DAME_NORMAL;
    protected int Mana = 100;

    public Hero() {

    }
    public Hero(String name, int HP, int Damege, int mana) {
        this.name = name;
        this.HP = HP;
        Damege = Damege;
        Mana = mana;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDamege() {
        return Damege;
    }

    public void setDamege(int Damege) {
        Damege = Damege;
    }

    public int getMana() {
        return Mana;
    }

    public void setMana(int mana) {
        Mana = mana;
    }

//
    public void Regen(int totalDamege) {
        if(this.Mana < Constant.MANA_SKILL) {
            System.out.println("Mana của bạn không đủ để hồi màu");
            return;
        }
        this.HP += totalDamege;
        if(this.HP > Constant.MAX_HP) {
            this.HP += Constant.MAX_HP;
        }
        this.Mana -= 10;
        System.out.println("Máu hiện tại của nhân vật là " + this.HP);

        System.out.println("Mana hiện tại của nhân vật là " + this.Mana);
    }
}


package T3H.GameRescueThePrincess;

public class Warrior extends Hero{
    private int armor = Constant.ARMOR_KNIGT;

    public Warrior() {

    }
    public Warrior(String name, int HP, int Damege, int mana, int armor) {
        super(name, HP, Damege, mana);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

//    trừ máu của nhận vặt
    public void decreaseHP(int dame) {
        this.HP -= dame*0.7;
        System.out.println("Máu hiện tại của nhân vật là " + this.HP);
    }

//    trả về dame của nhân vật
    public int totaDame() {
        return  this.Damege;
    }
}

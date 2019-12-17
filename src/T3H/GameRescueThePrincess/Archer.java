package T3H.GameRescueThePrincess;

public class Archer extends Hero {

    public Archer(String name, int HP, int Damege, int mana, int prime) {
        super(name, HP, Damege, mana);
    }

    public int totalDame() {
        int number = Constant.random.nextInt(100);
        if(number > 50) {
            return this.Damege;
        }else {
            return crit();
        }

    }

    public int crit() {
        return totalDame()*3;
    }
    public void DeareaseHP(int dame) {
        this.HP -= dame;
        System.out.println("Máu hiện tại của nhận vật là : " + this.HP);
    }
}

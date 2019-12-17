package T3H.GameRescueThePrincess;

public class Magician extends Hero {
    public Magician() {

    }
    public Magician(String name, int HP, int Damege, int mana) {
        super(name, HP, Damege, mana);
    }
//    dame của pháp sư
    public int totalDame(Dragon dragon) {
        int rateShowSkill = Constant.random.nextInt(100);
        int rateRegen = Constant.random.nextInt(100);
//        check sử dụng kill
        if(rateShowSkill > 50) {
//            check regen hp
            if(rateRegen < 50) {
                System.out.println("Bạn đã được hồi máu : ");
                int trueDame = (int)(dragon.getHP()/2*0.8);
                Regen(trueDame);
            }
            thunder(dragon);
            return 0;
        }
//        check đánh thường
        else {
            return  this.Damege;
        }
    }
//    tấn công con rông
    public void thunder(Dragon dragon) {
        if(this.Mana < Constant.MANA_SKILL_THUNDER) {
            System.out.println("Không đủ mana để dùng sill Magic");
            return;
        }
        dragon.decreaseHP(dragon.getHP()/2, Constant.DAME_MAGICAL);
    }

    //    trừ máu của nhận vặt
    public void decreaseHP(int dame) {
        this.HP -= dame;
        System.out.println("Máu hiện tại của Macgical là " + this.HP);
    }
}

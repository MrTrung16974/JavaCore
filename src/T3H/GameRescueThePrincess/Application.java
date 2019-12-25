package T3H.GameRescueThePrincess;

public class Application {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        Magician magician = new Magician();

        int  roud = 0;
        while (dragon.getHP() > 0 && magician.getHP() > 0) {
            System.out.println();
            System.out.println("Hiệp đấu thư " + roud);
            if(roud % 2 == 0) {
                int trueDame = magician.totalDame(dragon);
                System.out.println("Lượng sát thương gây ra cho Dragon là : " + trueDame);
                dragon.decreaseHP(trueDame,  Constant.DAME_PHYSICAL);
            }else {
                int trueDame = dragon.totalDame(magician);
                System.out.println("Lượng sát thương gây ra cho MagicCal là : " + trueDame);
                magician.decreaseHP(trueDame);
            }
            roud++;
        }
        if(magician.getHP() > 0) {
            System.out.println("\n*************************************");
            System.out.println("Cứu được công chúa " + new Princess().name);
        }else {
            System.out.println("End Game");
        }
    }
}

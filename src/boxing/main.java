package boxing;

public class main {
    public static void main(String[] args) {
        boxer boxer1 = new boxer("Nguyễn Tiến Trung", 15, 100, 50);
        boxer boxer2 = new boxer("Hachima", 10, 100, 50);
        int round = 1;
        if(boxer1.damage > boxer2.damage) {
            round = 2;
        }else {
            round = 1;
        }
        while (boxer1.hp > 0 && boxer2.hp > 0) {
            if(round % 2 == 0) {
                boxer2.hit(boxer1);
            }else {
                boxer1.hit(boxer2);
            }
            round ++;
        }

    }
}

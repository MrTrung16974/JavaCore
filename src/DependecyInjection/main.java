package DependecyInjection;


public class main {
    public static void main(String[] args) {
        Outfix bikini = new Bikini();
        Outfix clother = new Clother();
        Girl ngoctrinh = new Girl();
        Girl nam = new Girl();
        ngoctrinh.setOutfit(bikini);
        ngoctrinh.getOutfit().wear();
    }
}

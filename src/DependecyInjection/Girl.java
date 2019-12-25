package DependecyInjection;

class Bikini implements Outfix {
    public void wear() {
        System.out.println("Đã mặc Bikini");
    }
}
class Clother implements Outfix{
    public void wear() {
        System.out.println("Đã mặc quần áo");
    }
}


public class Girl {
    private Outfix outfit;
    private int a;
    public Outfix getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfix outfit) {
        this.outfit = outfit;
    }

//    public Girl(Outfix outfit) {
//        this.outfit = outfit;
//    }
}
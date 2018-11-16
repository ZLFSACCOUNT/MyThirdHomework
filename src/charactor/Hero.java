package charactor;

public class Hero {
    public String name;
    protected float hp;

    public void kill(Mortal m){
        System.out.println(name + " 交了第三次作业。" );
        m.die();
    }

    public static void main(String[] args) {
        Hero h =new Hero();
        h.name = "我";

        ADHero ad = new ADHero();
        ad.name = "黄师姐";

        APHero ap = new APHero();
        ap.name = "里脊学姐";

        ADAPHero adap = new ADAPHero();
        adap.name = "大锤学姐";

        h.kill(ad);
        h.kill(ap);
        h.kill(adap);
    }
}

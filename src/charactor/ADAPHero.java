package charactor;

public class ADAPHero extends Hero implements AD,AP,Mortal{

    @Override
    public void magicAttack() {

    }

    @Override
    public void physicAttack() {

    }

    @Override
    public void die() {
        System.out.println(name+ " 这个既强又美的学姐被我迷倒了。");
    }

}
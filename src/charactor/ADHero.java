package charactor;

public class ADHero extends Hero implements AD ,Mortal{

    @Override
    public void physicAttack() {

    }

    @Override
    public void die() {
        System.out.println(name+ " 这个强壮的学姐被我迷倒了。");
    }

}

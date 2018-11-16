package charactor;

public class APHero extends Hero implements AP,Mortal {
    public void magicAttack() {

    }

    @Override
    public void die() {
        System.out.println(name+ " 这个美丽的学姐被我迷倒了。");
    }

}

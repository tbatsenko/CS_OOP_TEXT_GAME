public class Hobbit extends Character {
    protected int power = 0;
    protected int hp = 3;

    public Hobbit(){
        this.power = power;
        this.hp = hp;
    }

    @Override
    public void kick(Character c){
        toCry();
    }

    public void toCry(){
        System.out.println(" I can't kick anyone, I'm crying :'( ");
    }
}

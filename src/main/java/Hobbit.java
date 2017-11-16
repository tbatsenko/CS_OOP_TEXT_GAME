public class Hobbit extends Character {
    private int power = 0;
    private int hp = 3;

    public Hobbit(){
        this.power = power;
        this.hp = hp;
    }

    @Override
    public void kick(Character c){
        toCry();
    }

    private void toCry(){
        System.out.println(" I can't kick anyone, I'm crying :'( ");
    }
}

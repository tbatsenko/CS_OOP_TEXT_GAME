public class Hobbit extends Character {
    private int power = 0;
    private int hp = 3;

    public Hobbit(){
        this.power = 0;
        this.hp = 3;
    }

    @Override
    public void kick(Character c){
        toCry();
    }

    @Override
    void setPower(int power) {
        this.power = power;

    }

    @Override
    void setHp(int hp) {
        this.power = power;

    }

    @Override
    int getPower() {
        return this.power;
    }

    @Override
    int getHp() {
        return this.hp;
    }

    private void toCry(){
        System.out.println(" I can't kick anyone, I'm crying :'( ");
    }


    boolean isAlive(){
        System.out.format(this.getClass().getName() + " has %d hp left \n", this.getHp());
        return this.hp > 0;
    }
}

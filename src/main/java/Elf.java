public class Elf extends Character{
    private int power = 10;
    private int hp = 10;

    Elf(){
        this.power = power;
        this.hp = hp;
    }

    @Override
    public void kick(Character c){
        if(this.power > c.getHp()){
            c.setHp(0);
            System.out.println("Elf just killed " + c.getClass().getName());
        }else {
            c.setPower(this.power - 1);
            System.out.println("Elf just kicked " + c.getClass().getName() + " and he lost 1pw !");
        }

    }

    @Override
    void setPower(int power) { this.power = power; }

    @Override
    void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    int getPower() {
        return this.power;
    }

    @Override
    int getHp() {
        return this.hp;
    }
}
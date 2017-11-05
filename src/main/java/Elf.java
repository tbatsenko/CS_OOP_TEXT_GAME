public class Elf extends Character{
    protected int power = 10;
    protected int hp = 10;

    public Elf(){
        this.power = power;
        this.hp = hp;
    }

    @Override
    public void kick(Character c){
        if(power > c.power){
            c.hp = 0;
            System.out.println("Elf just killed somebody!");
        }else {
            c.power -= 1;
            System.out.println("Elf just kicked somebody and he lost 1pw !");
        }

    }
}
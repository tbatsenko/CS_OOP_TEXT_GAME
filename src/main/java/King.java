import java.util.Random;

public class King extends Character{
    Random random = new Random();

    // King: power 5-15, hp 5-15,
    // kick(decrease number of hp of the enemy by random number which will be in range of his power)
    protected int power = 5;
    protected int hp = 5;


    public King(){
        this.power = power;
        this.hp = hp + random.nextInt(11);
    }


    @Override
    public void kick(Character c){
        power = random.nextInt(10) + 5;
        c.hp -= power;
        System.out.println("King just hit someone with a power of " + power);
    }
}

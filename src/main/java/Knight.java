import java.util.Random;

public class Knight extends Character{

    Random random = new Random();

    // Knight: power 2-12, hp 2-21, kick(like King)
    protected int power = 2;
    protected int hp = 2;

    public Knight(){
        this.power = power;
        this.hp = hp + random.nextInt(20);
    }

    @Override
    public void kick(Character c){
        power = random.nextInt(11) + 2;
        c.hp -= power;
        System.out.println("Knight just hit someone with a power of " + power);
    }
}


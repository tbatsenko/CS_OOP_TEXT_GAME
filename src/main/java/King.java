import java.util.Random;

public class King extends Character{
    private Random random = new Random();

    // King: power 5-15, hp 5-15,
    // kick(decrease number of hp of the enemy by random number which will be in range of his power)
    private static int power = 5;
    private static int hp = 5;

    public void setPower(int power) {
        this.power = power;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPower() {
        return this.power;
    }

    public int getHp() {
        return this.hp;
    }

    King() {
        this.power = 5;
        this.hp = 5 + random.nextInt(11);
    }
    @Override
    public void kick(Character c){
        this.power = random.nextInt(10) + 5;
        c.setHp(c.getHp() - this.power);
        System.out.println("King just hit someone with a power of " + this.power);
    }


    boolean isAlive(){
        System.out.format(this.getClass().getName() + " has %d hp left \n", this.getHp());
        return this.hp > 0;
    }
}

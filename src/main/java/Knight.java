import java.util.Random;

public class Knight extends Character{

    private static Random random = new Random();


    // Knight: power 2-12, hp 2-21, kick(like King)
    private static int power = 2;
    private static int hp = 2 + random.nextInt(20);

    @Override
    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getPower() {
        return this.power;
    }

    @Override
    public int getHp() {
        return this.hp;
    }

    Knight() {
        this.power = power;
        this.hp = hp;
    }


    @Override
    public void kick(Character c){
        power = random.nextInt(11) + 2;
        c.setHp(c.getHp() - power);
        System.out.println("Knight just hit someone with a power of " + power);
    }
}


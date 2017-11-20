public abstract class Character {
    private static int power;
    private static int hp;

    public abstract void kick(Character c);

    abstract void setPower(int power);

    abstract void setHp(int hp);

    abstract int getPower();

    abstract int getHp();


    boolean isAlive(){
        System.out.format(this.getClass().getName() + " has %d hp left \n", this.getHp());
        return this.hp > 0;
    }
}

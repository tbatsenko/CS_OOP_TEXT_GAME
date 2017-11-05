public abstract class Character {
    public int power=0;
    public int hp=0;


    public abstract void kick(Character c);

    public boolean isAlive(){
        return hp > 0;
    }
}

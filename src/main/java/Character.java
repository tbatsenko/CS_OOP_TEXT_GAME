public abstract class Character {
    int power=0;
    int hp=0;

    public abstract void kick(Character c);

    boolean isAlive(){
        return hp > 0;
    }
}

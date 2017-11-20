import java.util.Objects;
import java.util.Random;

public class GameManager {

    //GameManager: void fight(Character c1, Character c2) - to provide fight between to characters
    //and explaing via command line what happens during the fight, till both of the characters are alive.
    private Random random = new Random();

    Character fight(Character c1, Character c2) {
        System.out.println(c1.getClass().getName() + " will fight " + c2.getClass().getName() + " soon!");

        int first_to_attack = random.nextInt(2);

        if (Objects.equals(c1.getClass().getName(), "Hobbit") && Objects.equals(c2.getClass().getName(), "Hobbit")){
            System.out.format("Hobbit %d was lucky to attack first so he wins automatically", first_to_attack + 1);
            if (first_to_attack == 0)
            {
            return c1;
            }else return c2;
        }

        if (first_to_attack == 0) {
            System.out.println(c1.getClass().getName() + " will attack first!");
        } else {
            System.out.println(c2.getClass().getName() + " will attack first!");
            System.out.println(c2.getClass().getName() + " is kicking " + c1.getClass().getName());
            c2.kick(c1);
        }


        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(c1.getClass().getName() + " is kicking " + c2.getClass().getName());
            c1.kick(c2);

            if (c2.isAlive()) {
                System.out.println(c2.getClass().getName() + " is kicking " + c1.getClass().getName());
                c2.kick(c1);
                if (!c1.isAlive()) {
                    System.out.println(c1.getClass().getName() + " is dead!");
                    return c2;
                } else {
                    System.out.println(c2.getClass().getName() + " is dead!");
                    return c1;
                }
            }
        }
        if(c2.isAlive()){
            System.out.println(c2.getClass().getName() + " is dead!");
            return c1;
        }
        System.out.println(c1.getClass().getName() + " is dead!");
        return c2;
    }
}

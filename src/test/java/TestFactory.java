import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;


import static org.junit.Assert.*;

public class TestFactory {

    private CharacterFactory factory;
    {
        factory = new CharacterFactory();
    }

    @Before
    public void setup(){
        System.out.println("Running Test...");
    }

    @Test
    public void createSimpleCharacter() {
        assertNotNull(factory.createCharacter());
    }

    @Test
    public void testFightOfHobbits(){
        Hobbit h1 = new Hobbit();
        Hobbit h2 = new Hobbit();

        GameManager gm = new GameManager();

        System.out.format(h1.getClass().getName() + " has HP: %d, POWER: %d \n", h1.getHp(), h1.getPower());
        System.out.format(h2.getClass().getName() + " has HP: %d, POWER: %d \n", h2.getHp(), h2.getPower());

        assertNotNull(gm.fight(h1, h2));

    }

    @Test
    public void testFightOfKings(){
        King h1 = new King();
        King h2 = new King();

        GameManager gm = new GameManager();

        System.out.format(h1.getClass().getName() + " has HP: %d, POWER: %d \n", h1.getHp(), h1.getPower());
        System.out.format(h2.getClass().getName() + " has HP: %d, POWER: %d \n", h2.getHp(), h2.getPower());

        assertNotNull(gm.fight(h1, h2));

    }

    @Test
    public void testFightOfElfAndKnight(){
        Elf h1 = new Elf();
        Knight h2 = new Knight();

        GameManager gm = new GameManager();

        System.out.format(h1.getClass().getName() + " has HP: %d, POWER: %d \n", h1.getHp(), h1.getPower());
        System.out.format(h2.getClass().getName() + " has HP: %d, POWER: %d \n", h2.getHp(), h2.getPower());

        assertNotNull(gm.fight(h1, h2));

    }

    @Test
    public void testFightOfTwoRandomCharacters(){
        Character c1 = factory.createCharacter();
        Character c2 = factory.createCharacter();

        GameManager gm = new GameManager();

        System.out.format(c1.getClass().getName() + " has HP: %d, POWER: %d \n", c1.getHp(), c1.getPower());
        System.out.format(c2.getClass().getName() + " has HP: %d, POWER: %d \n", c2.getHp(), c2.getPower());

        assertNotNull(gm.fight(c1, c2));

    }
}

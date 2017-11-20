import java.util.Random;

public class CharacterFactory {
    //CharacterFactory: Character createCharacter() - returns random instance of any existing character.

    private Random random = new Random();



    public Character createCharacter() {
        int character_int = random.nextInt(4);

        if (character_int == 0) return new Hobbit();
        else if (character_int == 1) return new Elf();
        else if (character_int == 2) return new King();
        else return new Knight();
    }
}

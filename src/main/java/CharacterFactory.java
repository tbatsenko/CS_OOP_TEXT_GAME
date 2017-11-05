import java.util.Random;

public class CharacterFactory {
    //CharacterFactory: Character createCharacter() - returns random instance of any existing character.

    Random random = new Random();

    protected int character_int = random.nextInt(4);

    public Character CharacterFactory(){
        if(character_int == 0){

           Hobbit c = new Hobbit();
           return c;

        } else if(character_int == 1){

            Elf c = new Elf();
            return c;

        } else if(character_int == 2){

            King c = new King();
            return c;

        } else {

            Knight c = new Knight();
            return c;

        }

    }




}

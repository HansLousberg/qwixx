import DiceStuff.Color;
import DiceStuff.Die;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Die die = new Die(Color.White,2);
        for (int i = 0; i <100; i++){
            System.out.println(die.roll());

        }
    }
}




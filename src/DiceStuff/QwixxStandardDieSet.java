package DiceStuff;

public class QwixxStandardDieSet {

    Die white0 = new Die(Color.WHITE);
    Die white1 = new Die(Color.WHITE);
    Die red = new Die(Color.RED);
    Die yellow = new Die(Color.YELLOW);
    Die green = new Die(Color.GREEN);
    Die blue = new Die(Color.BLUE);
    public QwixxStandardDieSet(){


    }

    public StandardDiceResults roll(){
        return new StandardDiceResults(
                white0.roll(),
                white1.roll(),
                red.roll(),
                yellow.roll(),
                green.roll(),
                blue.roll()
        );
    }




}

package DiceStuff;

public class Die {
    private int max = 6;
    Color color = Color.WHITE;
    public Die(){

    }
    public Die(Color color){
        this.color = color;

    }

    public Die(Color color, int max){
        this.color = color;

        this.max = max;
    }

    public DieResult roll(){
        return new DieResult(this.color,(int)Math.random()*max + 1);
    }
}

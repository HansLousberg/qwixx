package DiceStuff;

public enum Color{
    WHITE(0) ,
    RED(1),
    YELLOW(2),
    GREEN(3),
    BLUE(4);
    private Color(int id){
        this.id = id;
    }
    public final int id;
}

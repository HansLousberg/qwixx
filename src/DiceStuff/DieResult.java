package DiceStuff;

public class DieResult implements Comparable<DieResult> {
    Color color;
    int value;

    public  DieResult(Color color,int value){
        this.color = color;
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(DieResult o) {
        if(this.color.id < o.color.id){
            return -1;
        } else if (this.color.id > o.color.id) {
            return 1;
        }
        if(this.value < o.value){
            return -1;
        } else if(this.value > o.value){
            return 1;
        }
        return 0;
    }
}

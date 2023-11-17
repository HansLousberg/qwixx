package DiceStuff;

import DiceStuff.Color;

public class CellValue implements Comparable<CellValue>{
    Color color;
    int value;
    public CellValue(Color color, int value){
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
    public int compareTo(CellValue o) {
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

    @Override
    public boolean equals(Object obj) {
        //return this.color.equals(obj.)
        return true;
    }
}

package DiceStuff;

import java.util.*;

public class StandardDiceResults{
    int white0;
    int white1;
    int red;
    int yellow;
    int green;
    int blue;

    public StandardDiceResults(
            DieResult white0,
            DieResult white1,
            DieResult red,
            DieResult yellow,
            DieResult green,
            DieResult blue
    ){
        this.white0 = white0.value;
        this.white1 = white1.value;
        this.red = red.value;
        this.yellow = yellow.value;
        this.green = green.value;
        this.blue = blue.value;
    }

    public CellValue getUniversalOption(){
        return new CellValue(Color.WHITE,white0+white1);
    }
    public SortedSet<CellValue> getColordOptions(){
        var result = new TreeSet<CellValue>();
        result.add(new CellValue(Color.RED,red+white0));
        result.add(new CellValue(Color.YELLOW,yellow+white0));
        result.add(new CellValue(Color.GREEN,green+white0));
        result.add(new CellValue(Color.BLUE,blue+white0));
        //if(white0 != white1) {
            result.add(new CellValue(Color.RED, red + white1));
            result.add(new CellValue(Color.YELLOW, yellow + white1));
            result.add(new CellValue(Color.GREEN, green + white1));
            result.add(new CellValue(Color.BLUE, blue + white1));
        //}
        //result.sort(Comparator.comparing(CellValue::getColor));
        return result;
    }


}

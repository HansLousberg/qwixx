package boards;

import DiceStuff.CellValue;
import DiceStuff.Color;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class StandardBoard {

    Map<Color,Row> rows = new EnumMap<>(Color.class)

    {
    };
    public StandardBoard(){
        RowBuilder rowBuilder = new RowBuilder();
        rows.put(Color.RED,rowBuilder.Ascending(2,12, Color.RED));
        rows.put(Color.YELLOW,rowBuilder.Ascending(2,12, Color.YELLOW));
        rows.put(Color.GREEN,rowBuilder.Descending(2,12, Color.GREEN));
        rows.put(Color.BLUE,rowBuilder.Descending(2,12, Color.BLUE));

    }
    boolean tickCell(CellValue cellValue){
        Row row = rows.get(cellValue.getColor());
        //row.
        throw new UnsupportedOperationException();

    }

    public int points(){

        throw new UnsupportedOperationException();
    }
}

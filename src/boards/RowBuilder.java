package boards;

import DiceStuff.CellValue;
import DiceStuff.Color;

import java.util.ArrayList;
import java.util.List;

public class RowBuilder {
    public RowBuilder(){

    }

    public Row Ascending(int lowerBounds, int upperBound, Color color){
        List<CellValue> values = new ArrayList<>(upperBound -lowerBounds + 1);
        for(int i = lowerBounds; i<=upperBound;i++){
            values.add(new CellValue(color,i));
        }
        return new Row(color,values);
    }

    public Row Descending(int lowerBounds, int upperBound, Color color){
        List<CellValue> values = new ArrayList<>(upperBound -lowerBounds + 1);
        for(int i = upperBound; i<=lowerBounds;i--){
            values.add(new CellValue(color,i));
        }
        return new Row(color,values);
    }
}

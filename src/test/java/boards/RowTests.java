package test.java.boards;

import DiceStuff.CellValue;
import DiceStuff.Color;
import boards.Cell;
import boards.Row;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RowTests {
    @Test
    public void RowConstructorTest(){
        List<CellValue> cellValues = new ArrayList<>();
        cellValues.add(new CellValue(Color.RED,2));
        Row row = new Row(Color.WHITE,cellValues);

        Assert.assertEquals(Color.WHITE,row.getLockColor());
        Assert.assertEquals(1,row.getCells().size());
        Assert.assertEquals(new CellValue(Color.RED,2),row.getCells().get(0));
    }
}

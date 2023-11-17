package test.java.boards;


import DiceStuff.CellValue;
import DiceStuff.Color;
import boards.CellStatus;
import boards.Row;
import boards.RowBuilder;

import java.util.ArrayList;
import java.util.List;

class pointsCalculatorTest {
    public void pointHappyflowTest(){
        List<Row> rows = new ArrayList<>(4);

        RowBuilder rowBuilder = new RowBuilder();
        rows.add(rowBuilder.Ascending(2,12,Color.RED));
        

    }
}
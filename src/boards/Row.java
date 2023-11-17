package boards;

import DiceStuff.CellValue;
import DiceStuff.Color;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Row {

    Color lockColor;
    List<Cell> cells;

    public Row(Color lockColor, List<CellValue> cells){
        this.lockColor = lockColor;
        this.cells = new ArrayList<>(cells.size());
        for (CellValue value:cells) {
            this.cells.add(new Cell(value));
        }
    }
    public boolean tickCell(CellValue cellValue){
        //assumption: each CellValue only exists once in each row
        int i = index(cellValue);
        if(i < 0){
            return false;
        }
        Cell cell = cells.get(i);
        if(cell.getStatus()!= CellStatus.OPEN){
            return false;
        }
        cell.setStatus(CellStatus.TICKED);
        i--;
        while (cells.get(i).getStatus()==CellStatus.OPEN && i >= 0){
            cells.get(i).setStatus(CellStatus.SKIPPED);
            i--;
        }
        return true;
    }

    public List<Cell> getCells(){
        //
        return cells;
    }

    public Color getLockColor() {
        return lockColor;
    }

    private int index(CellValue cellValue){
        for(int i = 0; i<cells.size()-1;i++){
            if(cells.get(i).equals(cellValue)){
                return i;
            }
        }
        return -1;

    }


}

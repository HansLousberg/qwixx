package boards;

import DiceStuff.CellValue;

public class Cell {
    private CellValue cellValue;
    private CellStatus status = CellStatus.OPEN;
    public Cell(CellValue cellValue){
        this.cellValue = cellValue;
    }


    public CellValue getCellValue() {
        return cellValue;
    }


    public CellStatus getStatus() {
        return status;
    }

    public void setStatus(CellStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

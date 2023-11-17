package test.java;


import DiceStuff.CellValue;
import DiceStuff.Color;
import DiceStuff.DieResult;
import DiceStuff.StandardDiceResults;
import org.junit.Assert;
import org.junit.Test;

public class StandardDiceResultsTests {
    @Test
    public void getColoredOptionsTest(){
        StandardDiceResults testee = new StandardDiceResults(
                new DieResult(Color.WHITE,1),
                new DieResult(Color.WHITE,2),
                new DieResult(Color.RED,3),
                new DieResult(Color.YELLOW,4),
                new DieResult(Color.GREEN,5),
                new DieResult(Color.BLUE,6)
        );

        //var result = testee.getUniversalOption();
        var results = testee.getColordOptions();
        Assert.assertEquals(results.size(),8);
    }

    @Test
    public void getColoredOptionsFilterDoublesTest(){
        StandardDiceResults testee = new StandardDiceResults(
                new DieResult(Color.WHITE,1),
                new DieResult(Color.WHITE,1),
                new DieResult(Color.RED,3),
                new DieResult(Color.YELLOW,4),
                new DieResult(Color.GREEN,5),
                new DieResult(Color.BLUE,6)
        );

        var result = testee.getUniversalOption();
        Assert.assertEquals(result,new CellValue(Color.WHITE,2));

        var results = testee.getColordOptions();
        Assert.assertEquals(results.size(),4);
        Assert.assertTrue(results.contains(new CellValue(Color.RED,4)));
        Assert.assertTrue(results.contains(new CellValue(Color.YELLOW,5)));
        Assert.assertTrue(results.contains(new CellValue(Color.GREEN,6)));
        Assert.assertTrue(results.contains(new CellValue(Color.BLUE,7)));
    }

    
}

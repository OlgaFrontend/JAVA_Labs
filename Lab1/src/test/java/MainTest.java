import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
 public class
MainTest {


    @Test
     public void averageLengthOfStringTest() {
        String []strs = {"hello!how are you","Hey","Lab 1"};
        int averageLength=(17+3+5)/strs.length;
        Assert.assertEquals(averageLength, Main.averageLengthOfString(strs));
    }

    @Test
    public void strWithLengthLessThanAvgTest() {
        String []strs = {"hello!how are you","Hey","Lab 1"};
        //(17+3+5)/3=8 -> середня довжина

        String[] expectedArray = {"Hey","Lab 1"};
       String [] resultArray =  Main.strWithLengthLessThanAvg(strs);

       Assert.assertEquals(expectedArray,resultArray);

    }

    @Test
    public void strWithLengthGreaterThanAvgTest() {

        String []strs = {"hello!how are you","Hey","Lab 1"};
        //(17+3+5)/3=8 -> середня довжина

        String[] expectedArray = {"hello!how are you"};
        String [] resultArray =  Main.strWithLengthGreaterThanAvg(strs);

        Assert.assertEquals(expectedArray,resultArray);


    }
}
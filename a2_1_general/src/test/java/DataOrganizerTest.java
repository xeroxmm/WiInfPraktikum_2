import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertArrayEquals;

public class DataOrganizerTest {
    @Test
    public void bubbleSort(){
        ArrayList<Integer> testDataSorted = new ArrayList<>();
        ArrayList<Integer> testDataShuffled = new ArrayList<>();

        for(int i = -5000; i < 5001; i++){
            testDataSorted.add( i );
            testDataShuffled.add( i );
        }
        for(int i = 0; i < 10; i++){
            Collections.shuffle( testDataShuffled );
        }

        DataOrganizer data = new DataOrganizer();
        testDataShuffled = data.bubbleSort( testDataShuffled );

        assertArrayEquals(testDataSorted.toArray(), testDataShuffled.toArray());
    }
}

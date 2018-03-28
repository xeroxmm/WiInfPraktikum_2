import kotlin.test.Test
import kotlin.test.assertEquals

class DataOrganizerTestKt {
    @Test
    fun bubbleSort() {
        val testDataSorted = ArrayList<Long>()
        var testDataShuffled = ArrayList<Long>()

        for (i in -5000..5000L) {
            testDataSorted.add(i)
            testDataShuffled.add(i)
        }
        for (i in 0..9L) {
            testDataShuffled.shuffle()
        }

        val data = DataOrganizerKt()
        testDataShuffled = data.bubbleSort(testDataShuffled)

        assertEquals(testDataSorted, testDataShuffled)
    }
}
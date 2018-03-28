class DataOrganizerKt {
    fun bubbleSort(arrayList: ArrayList<Long>): ArrayList<Long> {
        var j: Int
        var i = 1

        while (i < arrayList.size) {
            j = 0
            while (j < arrayList.size - i) {
                if (arrayList[j + 1] < arrayList[j])
                    arrayList[j] = arrayList[j + 1].also { arrayList[j + 1] = arrayList[j] }
                j++
            }
            i++
        }

        return arrayList
    }
}
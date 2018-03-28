import java.util.ArrayList;

public class DataOrganizer {
    public ArrayList<Integer> bubbleSort(ArrayList<Integer> arrayList){
        int temporaryElement, i, j;

        for(i = 1; i < arrayList.size(); i++){
            for(j = 0; j < arrayList.size()-i; j++){
                if(arrayList.get(j+1) < arrayList.get(j)){
                    temporaryElement = arrayList.get( j );
                    arrayList.set(j, arrayList.get(j+1));
                    arrayList.set(j+1, temporaryElement);
                }
            }
        }

        return arrayList;
    }
}

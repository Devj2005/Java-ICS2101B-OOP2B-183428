package endweekexercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ArraySRsortingandreversing {
    public static void main(String[] args){
        //initial array of pallets...
        String[] pallets = {"A1","A2","B3","C4","D5","E6"}; 

        //SORT ARRAY IN ASCENDING ORDER:
        System.out.println("Sorted: ");
        Arrays.sort(pallets);
        for (String pallet : pallets){
            System.out.println("----"+pallet);

        }



        //Reverse the sorted array:
        System.out.println("\n Reversed: ");
        List<String> palletList = Arrays.asList(pallets);
        Collections.reverse(palletList); //reverses the order of the list
        for (String pallet : palletList){
            System.out.println("----"+pallet);
        }


    }

}
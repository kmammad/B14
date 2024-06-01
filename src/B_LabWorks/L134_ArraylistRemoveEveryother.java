package B_LabWorks;

import java.util.*;

public class L134_ArraylistRemoveEveryother {

    public static void main(String[] args){

        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hi");
        list.add("que");
        list.add("paso");
        list.add("sup");

        everyOther(list);

        System.out.println(list); //[hi, paso]

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hi");
        list1.add("yo");
        list1.add("sup");
        list1.add("yolo");
        list1.add("boop");

        everyOther(list1);

        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("hey");
        list2.add("yo");
        list2.add("sup");

        everyOther(list2);

        System.out.println(list2);


    }


    public static void everyOther(ArrayList<String> nums){

        for (int i = nums.size() - 1; i >=0; i--){
            if (i % 2 == 0){
                nums.remove(i);
            }
        }

    }

}

/**
 for (int i = 0; i < nums.size();i++){
 nums.remove(i);
 }
 */
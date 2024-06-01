package Day12;

import java.util.ArrayList;

public class ListBooleans {

    public static void main(String[] args) {

        ArrayList<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(false);
        list.add(true);

        ArrayList<Boolean> list1 = new ArrayList<>(list);
/**
      for (Boolean each : list){
          list1.add(each);
      }

      list.clear();
      list.addAll(list1);

        System.out.println(list);

 */

int originalSize = list.size();

        for (int i = 0; i < originalSize; i++) {
            list.add(list.get(i));
        }
        System.out.println(list);
    }

}


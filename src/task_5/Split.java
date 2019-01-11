package task_5;

import java.util.HashMap;
import java.util.Map;

public class Split {
    private int number;
    public Map<String, Integer> groups = new HashMap<>();
    private int[] array = new int[3];

    public Split(int number) {
        this.number = number;
        fillGroups();
    }

    private void fillGroups() {
        div();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 1_000){
                groups.put("units", array[i]);
            }
            if (array[i] < 1_000_000 && array[i] >= 1000){
                groups.put("thousands", array[i] / 1_000);
            }
            if (array[i] < 1_000_000_000 && array[i] >= 1_000_000){
                groups.put("millions", array[i] / 1_000_000);

            }
        }
    }

    public void div (){
        array[0] = number % 1_000;
        array[1] = (number % 1_000_000);
        array[2] = (number % 1_000_000_000);
    }
}

package task_5;

import java.util.HashMap;
import java.util.Map;

public class Split {
    private int number;
    public Map<String, Integer> groups = new HashMap<>();
    private int[] numberOfGroups = new int[3];

    public Split(int number) {
        this.number = number;
        fillGroups();
    }

    private void fillGroups() {
        div();
        int temp = 1;
        for (int i = 0; i < numberOfGroups.length; i++) {
            numberOfGroups[i] = number % (temp *= 1000);
        }
        for (int i = 0; i < numberOfGroups.length; i++) {
            if (numberOfGroups[i] < 1_000){
                groups.put("units", numberOfGroups[i]);
            }
            if (numberOfGroups[i] < 1_000_000 && numberOfGroups[i] >= 1000){
                groups.put("thousands", numberOfGroups[i] / 1_000);
            }
            if (numberOfGroups[i] < 1_000_000_000 && numberOfGroups[i] >= 1_000_000){
                groups.put("millions", numberOfGroups[i] / 1_000_000);

            }
        }
    }

    public void div (){

        numberOfGroups[0] = number % 1_000;
        numberOfGroups[1] = number % 1_000_000;
        numberOfGroups[2] = number % 1_000_000_000;
    }
}

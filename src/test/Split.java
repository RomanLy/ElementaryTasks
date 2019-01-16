//package test;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Split {
//
//    private int number;
//    public Map<String, Integer> groups = new HashMap<>();
//    private int[] numberOfGroups = new int[3];
//
//    Assemble assemble = new Assemble(groups);
//
//    public Split(int number) {
//        this.number = number;
//    }
//
//    private void fillGroups() {
//        div();
//        for (int i = 0; i < numberOfGroups.length; i++) {
//            if (numberOfGroups[i] < 1_000) {
//                groups.put("units", numberOfGroups[i]);
//            }
//            if (numberOfGroups[i] < 1_000_000 && numberOfGroups[i] >= 1000) {
//                groups.put("thousands", numberOfGroups[i] / 1_000);
//            }
//            if (numberOfGroups[i] < 1_000_000_000 && numberOfGroups[i] >= 1_000_000) {
//                groups.put("millions", numberOfGroups[i] / 1_000_000);
//
//            }
//        }
//    }
//
//    public void div() {
//        int temp = 1;
//        for (int i = 0; i < numberOfGroups.length; i++) {
//            numberOfGroups[i] = number % (temp *= 1000);
//        }
//    }
//
//    private int getDischarge() {
//        int i = 1;
//        while ( i <= number) {
//            i *= 10;
//        }
//        return i;
//    }
//    private int getPrecision(int discharge) {
//        int count = 0;
//        while (discharge > 1) {
//            discharge /= 10;
//            count++;
//        }
//        return count;
//    }
//    private void divide(int discharge) {
//        int temp = 1;
//        for (int i = 1; i < 10; i++) {
//            if (temp < discharge) {
//                array[i] = number % (temp *= 10);
//            } else {
//                break;
//            }
//        }
//    }
//}

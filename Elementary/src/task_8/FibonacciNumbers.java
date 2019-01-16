package task_8;

import java.util.ArrayList;

public class FibonacciNumbers {

    private int diapasonBegin;
    private int diapasonEnd;
    private int discharge;
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public FibonacciNumbers(int diapasonBegin, int diapasonEnd) {
        this.diapasonBegin = diapasonBegin;
        this.diapasonEnd = diapasonEnd;
    }
    public FibonacciNumbers(int discharge) {
        this.discharge = discharge;
    }

    private void fibDiapason() {
        arrayList.add(1);
        arrayList.add(1);

        int temp;
        int i = 1;
        while (arrayList.get(i) < diapasonEnd) {

            temp = arrayList.get(i - 1) + arrayList.get(i);
            if (temp > diapasonEnd) {
                break;
            }
            arrayList.add(temp);
            i++;
        }
    }
    public String printDiapason(){
        fibDiapason();
        String s = "";
        for (int i = 0; i < arrayList.size(); i++) {
            if ((arrayList.get(i) > diapasonBegin)&&(arrayList.get(i) < diapasonEnd)){
                s += (arrayList.get(i) + " ");
            }
        }
        return s;
    }




}

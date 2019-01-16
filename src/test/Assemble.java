//package test;
//
//import java.util.Map;
//
//public class Assemble {
//
//    private int number;
//    public Map<String, Integer> groups;
//    private int[] array = new int[4];
//
//    private String[][] numbers = {
//            {""},
//            {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"},
//            {"","десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят",
//                    "семьдесят", "восемьдесят", "девяносто"},
//            {"","сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот",
//                    "семьсот", "восемьсот", "девятьсот"}
//    };
//    private String[][] difference = {
//            {""},
//            {"", "одна","две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"},
//            {"","одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
//                    "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"},
//            {"тысяча", "тысячи", "тысяч"},
//            {"миллион", "миллиона", "миллионов"},
//            {"миллиард","миллиарда","миллиардов"}
//    };
//
//    public Assemble(Map<String, Integer> groups) {
//        this.groups = groups;
//    }
//
//    private String merge(int precision) {
//        String putOut = "";
//        int a = getDischarge();
//        for (int i = precision; i > 0; i--) {
//            if (array[2] > 10 && array[2] < 20 && array[3] == 0) {
//                putOut += (difference[2][array[1]] + " ");
//                break;
//            }
//            if (array[2] > 10 && array[2] < 20) {
//                putOut += (numbers[3][array[3] / 100] + " " + difference[2][array[1]] + " ");
//                break;
//            }
//            putOut += (numbers[i][(array[i] / (a /= 10))] + " ");
//        }
//
//        return putOut;
//    }
//
//    public String merge1(){
//        String s = "";
//        for (int i = groups.length - 1; i >= 0; i--) {
//            if (!split.groups.containsKey(groups[i])){
//                continue;
//            }
//            number = split.groups.get(groups[i]);
//            divide(getDischarge());
//            s += (merge(getPrecision(getDischarge())) + declension(groups[i], number) + " ");
//        }
//        return s;
//    }
//
//
//}

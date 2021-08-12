package org.hillel.HW3_continue_logical_task;

public class ChainWar {

    public static void main(String[] args) {

        //Lee`s army
        int headLi = 860;
        int wLi = 13 * headLi;
        int aLi = 24 * headLi;
        int rLe = 46 * headLi;
        int totalMightLi = wLi + aLi + rLe;

        //Ming army
        double headMin = 860 * 1.5;
        double wMin = 9 * headMin;
        double aMin = 35 * headMin;
        double rMin = 12 * headMin;
        int totalMightMin = (int) (wMin + aMin + rMin);

        System.out.println("Total might of Lee`s army: " + totalMightLi);
        System.out.println("Total might of Ming army : " + totalMightMin);
    }


}

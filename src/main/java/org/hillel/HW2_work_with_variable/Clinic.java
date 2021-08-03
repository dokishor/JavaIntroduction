package org.hillel.HW2_work_with_variable;

public class Clinic {

    public static void main(String[] args) {

        char numberOfPatients = 'y';
        String bite = "7y";
        String biteDoc = "100";
        String bitePat = "2y";
        String decision = "7y-100=2y";
        String theEquation = "7y-100=2y";

        System.out.println("Общее количество больных: " + numberOfPatients + ";");
        System.out.println("Общее количество укусов: " + bite + ";");
        System.out.println("Число укусов на больных: " + bitePat + ";");
        System.out.println("Количество укусов на докторе: " + biteDoc + ";");
        System.out.println("Уравнение: " + theEquation + ";");
        System.out.println("Ответ: " + 20 + " " + "Больных находится на данный момент в стационаре.");

    }
}


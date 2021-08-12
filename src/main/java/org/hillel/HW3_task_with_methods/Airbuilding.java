package org.hillel.HW3_task_with_methods;

public class Airbuilding {
    public static void main(String[] args) {

        int secondClassPassengers = 250;
        int firstClassPassengers = 20;

        // Fighter
        String firstType = buildAirplane("Jet", "F22-Raptor");
        System.out.println(firstType);

        //Passenger plane with economy class seats
        String secondType = buildAirplane("Airbus", "A220", secondClassPassengers);
        System.out.println(secondType);

        //Passenger plane with economy + business class seats
        String thirdType = buildAirplane("Boeing", "737", secondClassPassengers, firstClassPassengers);
        System.out.println(thirdType);
    }

    public static String buildAirplane(String name, String type) {
        return "Aircraft name: " + name + ", " + "model: " + type;
    }

    public static String buildAirplane(String name, String type, int secondClassPassengers) {
        return "Aircraft name: " + name + ", "
                + "model: " + type + ", "
                + "number of economy class passengers: " + secondClassPassengers;
    }

    public static String buildAirplane(String name, String type, int secondClassPassengers, int firstClassPassengers) {
        return "Aircraft name: " + name + ", "
                + "model: " + type + ", "
                + "number of economy class passengers: " + secondClassPassengers + ", "
                + "number of business class passengers: " + firstClassPassengers;
    }
}

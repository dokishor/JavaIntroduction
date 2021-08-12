package org.hillel.HW4_task_with_methods;

public class Person {

    public static void main(String[] args) {

        String personInfo = personInfo("Tom", "Cat", "London", 360245855);
        System.out.println(personInfo);

        String personInfo1 = personInfo("Jerry", "Mouse", "New York", 641246261);
        System.out.println(personInfo1);

        String personInfo2 = personInfo("Spike", "Dog", "Berlin", 896512568);
        System.out.println(personInfo2);
    }

    public static String personInfo(String name, String surname, String city, int pNumb) {
        return "Call a citizen: " + name + " " + surname + ", " + "from city: " + city + ", " + "you can call: " + pNumb;
    }
}

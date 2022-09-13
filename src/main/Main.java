package main;

public class Main {
    public static void main(String[] args) {
        MyArrayList employees = new MyArrayList();
        employees.add("Alex");
        employees.add("Serg");
        employees.add("Ola");
        employees.add("Khan");
        employees.add("Zula");
        for (int i = 0; i < employees.getSize();i++) {
            System.out.println(employees.get(i));
        }
    }
}

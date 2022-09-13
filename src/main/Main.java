package main;

public class Main {
    public static void main(String[] args) {
        String[] employees = {
                "Саша",
                "Коля",
                "Вася",
                "Толя",
                "Иван"
        };
        String[] second = new String[employees.length + 1 ];
        for (int i = 0; i < employees.length;i++){
            second[i] = employees[i];
        }
        second[second.length -1] = "Зуля";
        employees = second;
        String[] newNames = new String[employees.length -1];
        for (int i = 0,j = 0; i < newNames.length;i++){
            if(employees[i] != null){
                newNames[j] = employees[i];
                j++;
            }
        }
        employees = newNames;
        for (String name: employees) {
            System.out.println(name);
        }

    }
}

package ru.maxvagan;

public class Main {

    public static void main(String[] args) {
//	    Task 1
        System.out.println("Task 1");
        String firstName  = "Ivan";
        String middleName = "Ivanovich";
        String lastName   = "Ivanov";
        String fullName = String.join(" ", lastName, firstName, middleName);
        System.out.println("ФИО сотрудника - " + fullName);
//	    Task 2
        System.out.println("Task 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());
//	    Task 3
        System.out.println("Task 3");
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника - " + fullName.replace('ё', 'e'));
    }
}

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
//	    Extra Task 5
        System.out.println("Task 5");
        fullName = "Ivanov Ivan Ivanovich";
        short firstSpacePos = 0; short secondSpacePos = 0;
        System.out.println("Ф.И.О. - " + fullName);
        firstSpacePos = (short)fullName.indexOf(" ");
        secondSpacePos = (short)fullName.lastIndexOf(" ");
        firstName = fullName.substring(firstSpacePos + 1, secondSpacePos);
        middleName = fullName.substring(0, firstSpacePos);
        lastName = fullName.substring(secondSpacePos+1, fullName.length());
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + middleName);
        System.out.println("Отчество сотрудника — " + lastName);
//	    Task 6
        System.out.println("Task 6");
        fullName = "ivanov ivan ivanovich";
        System.out.println("Было фио - " + fullName);
        char[] buffArrayChar = fullName.toCharArray();
        fullName = "";
        for (int i = 0; i < buffArrayChar.length; i++) {
            if (i == 0 || i == firstSpacePos+1 || i == secondSpacePos+1)
                fullName += Character.toUpperCase(buffArrayChar[i]);
            else
                fullName += buffArrayChar[i];
        }
        System.out.println("Стало фио - " + fullName);
//	    Task 7
        System.out.println("Task 7");
        String strFirst = "135"; String strSecond = "246";
        StringBuilder newStr = new StringBuilder();
        int i = 0;
        if (strFirst.length() < strSecond.length()) {
            for (; i < strFirst.length(); i++) {
                newStr.append(strFirst.charAt(i));
                newStr.append(strSecond.charAt(i));
            }
            newStr.append(strSecond.substring(i, strSecond.length()));
        } else if (strFirst.length() > strSecond.length()) {
            for (i = 0; i < strSecond.length(); i++) {
                newStr.append(strFirst.charAt(i));
                newStr.append(strSecond.charAt(i));
            }
            newStr.append(strFirst.substring(i, strFirst.length()));
        } else {
            for (i = 0; i < strFirst.length(); i++) {
                newStr.append(strFirst.charAt(i));
                newStr.append(strSecond.charAt(i));
            }
        }
        System.out.println("Данные строки "+newStr);
//	    Task 8
        System.out.println("Task 8");
        String engStr = "aabccddefgghiijjkk";
        String strOfDups = "";
        buffArrayChar = engStr.toCharArray();
        for (char symb : buffArrayChar) {
            if(engStr.indexOf(symb) != engStr.lastIndexOf(symb) && strOfDups.indexOf(symb) < 0) strOfDups += symb;
        }
        System.out.println(strOfDups);
    }
}

package ru.fedosova;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner newInput = new Scanner(System.in);
        String dayName = newInput.nextLine();

        switch (dayName.toLowerCase()) {
            case "sunday":
                System.out.println( "Воскресенье");
                break;
            case "monday":
                System.out.println( "Понедельник");
                break;
            case "tuesday":
                System.out.println( "Вторник");
                break;
            case "wednesday":
                System.out.println( "Среда");
                break;
            case "thursday":
                System.out.println( "Четверг");
                break;
            case "friday":
                System.out.println( "Пятница");
                break;
            case "saturday":
                System.out.println( "Суббота");
                break;
            default:
                System.out.println( "Неизвестный день");
                break;
        }
    }
}

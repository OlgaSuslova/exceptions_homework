/* Задача 1: Напишите программу, которая запрашивает у пользователя число и проверяет, 
является ли оно положительным. Если число отрицательное или равно нулю, 
программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число". 
В противном случае, программа должна выводить сообщение "Число корректно".*/

import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class PositiveNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            checkPositiveNumber(number);
            System.out.println("Число корректно");
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        scanner.close();
    }

    public static void checkPositiveNumber(int number) throws InvalidNumberException {
        if (number <= 0) {
            throw new InvalidNumberException("Некорректное число");
        }
    }
}
package org.example;

/**
 * Если необходимо, исправьте данный код <br>
 * (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 *
 * Внесем исправления таким образом, чтобы код отрвбатывал без возникновения исключений.
 *
 * Возможные варианты:
 * - полностью исправить код так, чтобы не происходило иск
 */


public class Main {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7,8,9,0};

        try {
            int d = 1;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX2;

/**
 *
 * @author Wael
 */
public class MathOperations {
    public int calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Nombre négatif passé : " + number);
        }
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new ArithmeticException("Tentative de calcul de la racine carrée d’un nombre négatif : " + number);
        }
        return Math.sqrt(number);
    }
}

package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 12
     * -2,147,483,648 -> exception, error message
     */

    public int reverse(int inputNumber) {
        int reverseNumber = 0;
        if (inputNumber > 0) {
            while(inputNumber != 0) {
                reverseNumber = reverseNumber * 10 + inputNumber % 10;
                inputNumber /= 10;
            }
            return reverseNumber;
        }
        else {
            inputNumber *= -1;
            while(inputNumber != 0) {
                reverseNumber = (reverseNumber * 10) + (inputNumber % 10);
                inputNumber /= 10;
            }
            return reverseNumber * -1;
        }
    }
}

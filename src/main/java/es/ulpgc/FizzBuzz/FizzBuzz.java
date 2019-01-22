package es.ulpgc.FizzBuzz;

public class FizzBuzz {
    public String of(int number) {
        String result = fizz(number) + buzz(number);
        return result.isEmpty() ? getString(number) : result;
    }

    private String fizz(int number) {
        return isMultipleOfThree(number) ? "Fizz" : "";
    }
    private String buzz(int number) {
        return isMultipleOfFive(number) ? "Buzz" : "";
    }

    private boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }

    private String getString(int number) {
        return String.valueOf(number);
    }
}

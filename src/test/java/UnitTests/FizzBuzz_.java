package UnitTests;

import es.ulpgc.FizzBuzz.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzz_ {

    private FizzBuzz fizzBuzz;
    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void given_a_number_should_return_the_number() {
        assertThat(fizzBuzz.of(1)).isEqualTo("1");
    }

    @Test
    public void given_another_number_should_return_the_number() {
        assertThat(fizzBuzz.of(2)).isEqualTo("2");
    }
    @Test
    public void given_3_should_return_the_Fizz() {
        assertThat(fizzBuzz.of(3)).isEqualTo("Fizz");
    }
    @Test
    public void given_5_should_return_the_Fizz() {
        assertThat(fizzBuzz.of(5)).isEqualTo("Buzz");
    }
    @Test
    public void given_15_should_return_the_Fizz() {
        assertThat(fizzBuzz.of(15)).isEqualTo("FizzBuzz");
    }

}

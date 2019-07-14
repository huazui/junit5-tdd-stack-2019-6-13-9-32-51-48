package com.thoughtworks.tdd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.HelloWorld;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class HelloWorldTest {




    @Test
    @DisplayName("try display name")
    public void when2Get2() {
        //given
        Dependency dependency = new Dependency();
       String actual=dependency.fizzBuzz(2);


        //then
        assertThat(actual, is("2"));
    }

    @Test
    @DisplayName("try display name")
    public void when3GetFizz() {
        //given
        Dependency dependency = new Dependency();
        String actual=dependency.fizzBuzz(3);


        //then
        assertThat(actual, is("Fizz"));
    }
    @Test
    @DisplayName("try display name")
    public void when5GetBuzz() {
        //given
        Dependency dependency = new Dependency();
        String actual=dependency.fizzBuzz(5);


        //then
        assertThat(actual, is("Buzz"));
    }
    @Test
    @DisplayName("try display name")
    public void when15GetFizzBuzz() {
        //given
        Dependency dependency = new Dependency();
        String actual=dependency.fizzBuzz(15);


        //then
        assertThat(actual, is("FizzBuzz"));
    }

    @Test
    @DisplayName("try display name")
    public void when35GetBuzWhizzz() {
        //given
        Dependency dependency = new Dependency();
        String actual=dependency.fizzBuzz(35);


        //then
        assertThat(actual, is("BuzzWhizz"));
    }

    @Test
    @DisplayName("try display name")
    public void when21GetFizzWhizz() {
        //given
        Dependency dependency = new Dependency();
        String actual=dependency.fizzBuzz(21);


        //then
        assertThat(actual, is("FizzWhizz"));
    }
    @Test
    @DisplayName("try display name")
    public void when105GetFizzBuzzWhizz() {
        //given
        Dependency dependency = new Dependency();
        String actual=dependency.fizzBuzz(105);


        //then
        assertThat(actual, is("FizzBuzzWhizz"));
    }
}

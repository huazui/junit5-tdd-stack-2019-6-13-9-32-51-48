package com.thoughtworks.tdd;

import org.junit.jupiter.api.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class HelloWorldTest {

    @BeforeAll
    static void initTestEnv() {
    }

    @BeforeEach
    void initEveryMethod() {
    }


    @Test
    @DisplayName("try display name")
    public void hello_world_test() {
        //given
        Dependency dependency = new Dependency();
        //when
        String result=dependency.say(2);
        String myExpect="2";

        //then
       Assertions.assertEquals(myExpect,result);
    }

//    @Test
//    public void should_be_mocked() {
//        //given
//        Dependency dependency = mock(Dependency.class);
//        when(dependency.say()).thenReturn("Hello World");
//        HelloWorld helloWorld = new HelloWorld(dependency);
//
//        //when
//        String actual = helloWorld.beenCalled();
//
//        //then
//        assertThat(actual, is("Hello World"));
//    }
}

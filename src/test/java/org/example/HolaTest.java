package org.example;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

import static org.example.Hola.sayHello;
import static org.junit.jupiter.api.Assertions.*;

public class HolaTest {
    @Test
    public void rightSentence(){
        assertEquals("Hello",sayHello());
    }

}
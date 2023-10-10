package com.example.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculadora {
     @Test
    public void testAdd2Operands(){
         long total = Integer.parseInt(Calculadora.calculator("5+3"));
         assertEquals("X+Y operations not working correctly", 8, total);
     }
     @Test
    public void testAdd1Operand(){
         long total = Integer.parseInt(Calculadora.calculator("4+3+1"));
        assertEquals("+X operations not working correctly",8,total);

     }
     @Test
    public void testMult2Operands(){
         long total = Integer.parseInt(Calculadora.calculator("4*2"));
         assertEquals("4*X operations not working correctly",8,total);
     }
    @Test
    public void testMult1(){
        long total = Integer.parseInt(Calculadora.calculator("2*3"));
        assertEquals("2*X operations not working correctly",6,total);
    }
    @Test
    public void testMult2(){
        long total = Integer.parseInt(Calculadora.calculator("1*2*8"));
        assertEquals("1*X*Y operations not working correctly",16,total);
    }
    @Test
    public void testMult3(){
        long total = Integer.parseInt(Calculadora.calculator("2*2+3"));
        assertEquals("2*X+Y operations not working correctly",7,total);
    }
    @Test
    public void testMult4(){
        long total = Integer.parseInt(Calculadora.calculator("3+2*2"));
        assertEquals("3+X*Y operations not working correctly",7,total);
    }
    @Test
    public void testMult5(){
        long total = Integer.parseInt(Calculadora.calculator("3+2*2+4"));
        assertEquals("3+X*Y+Z operations not working correctly",11,total);
    }

}


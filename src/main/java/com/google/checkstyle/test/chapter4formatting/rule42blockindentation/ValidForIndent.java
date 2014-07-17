/*
 * InputValidForIndent.java
 *
 * Created on November 10, 2002, 10:04 PM
 */

package com.google.checkstyle.test.chapter4formatting.rule42blockindentation;

/**
 *
 * @author  jrichard
 */
public class ValidForIndent {
    
    /** Creates a new instance of InputValidForIndent */
    public ValidForIndent() {
    }
    
    
    private void method1(int[] indices)
    {
        for (int i=0; i<10; i++) 
            System.getProperty("foo");
        
        for (int i=0; i<10; i++) System.getProperty("foo");

        for (int i=0; i<10; i++) {
        }

        for (int i=0; i<10; i++) 
        {
        }

        for (int i=0; i<10; i++) 
        {
            System.getProperty("foo");
        }

        for (int i=0; i<10; i++) 
        {
            boolean test = true;
            if (test) { // mixed styles are OK
                System.getProperty("foo");
            }
        }
        
        for (
            int i=0; 
            i<10; 
            i++) 
        {
        }
        
        for (int i=0; 
            i<10 && 4<5
                && 7<8; 
            i++) 
        {
        }
        
        for (int i=0; i<10 && 4<5
                && 7<8; 
            i++) {
        }

        for (int i=0; i<10 && 4<5 && 7<8; 
            i++) {
        }

        
        for (int i=0; 
            i<10; i++
        ) {
            System.getProperty("foo");
        }

        for ( final int index : indices ) {
            System.err.println(index);
        }
        for ( final int index : indices )
        {
            System.err.println(index);
        }
    }
}
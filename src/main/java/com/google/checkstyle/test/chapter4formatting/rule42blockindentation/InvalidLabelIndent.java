/*
 * InputInvalidLabelIndent.java
 *
 * Created on February 22, 2003, 12:11 AM
 */

package com.google.checkstyle.test.chapter4formatting.rule42blockindentation;

/**
 *
 * @author  jrichard
 */
public class InvalidLabelIndent {
    
    /** Creates a new instance of InputInvalidLabelIndent */
    public InvalidLabelIndent() {
        boolean test = true;
        
        while (test) {
          label:
            System.out.println("label test");
            
            if (test) {
                unusedLabel:
                System.out.println("more testing");
            }
            
        }
  label2:
        System.out.println("toplevel");
    label3:
                  System.out.println("toplevel");
                  System.out.println("toplevel");
    label4:
      System.out.println("toplevel");
    label5:
      System
            .out.
                println("toplevel");
    }
    
}
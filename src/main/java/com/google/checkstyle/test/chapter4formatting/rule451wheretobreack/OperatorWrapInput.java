package com.google.checkstyle.test.chapter4formatting.rule451wheretobreack;

import java.util.HashMap;
import java.util.Map;

class OperatorWrapInput
{
    void test()
    {
        /*Warn*/int x = 1 + 
                /*Warn*/ 2 - 
            3
            -
            4;
        x = x + 2;
        boolean y = true
            &&
            false;
        /*Warn*/ y = true && 
            false;
        y = false
            && true;
    }
    
    void testAssignment()
    {
        int x
            = 0; //warn
        int y =
            0;
    }
    
    <
    /*warn*/ T extends Comparable & 
        java.io.Serializable
    >
    void testGenerics1()
    {
        Comparable
            <
            String
            >
            c = new String();
        Map<String, String> map = new HashMap<String, String>();

        boolean flag = false;
        
        int init = 9;
        
        /*ok*/ for (Map.Entry<String, String> entry :
            map.entrySet())
        {
            /*warn*/int i = flag == true ?
                    1 : 2;
        }
        
        /*warn*/ if (init !=
                9)
        {
            
        }
        
        /*warn*/ while (init ==
                10)
        {
            
        }
        
        /*warn*/ if (init >
                10)
        {
            
        } else {}
        
        /*warn*/ while (init < 10 ||
                !flag) {
            
        }
    }
    
    class Inner {
        void testGenerics1
        ()
        {
            Comparable
                <
                String
                >
                c = new String();
            Map<String, String> map = new HashMap<String, String>();
            boolean flag = false;
            
            int init = 9;
            
            /*ok*/ for (Map.Entry<String, String> entry :
                map.entrySet())
            {
                /*warn*/int i = flag == true ?
                        1 : 2;
            }
            
            /*warn*/ if (init !=
                    9)
            {
                
            }
            
            /*warn*/ while (init ==
                    10)
            {
                
            }
            
            /*warn*/ if (init >
                    10)
            {
                
            } else {}
            
            /*warn*/ while (init < 10 ||
                    !flag) {
                
            }
        }
    }
    
    Inner anon = new Inner
            (){
        void testGenerics1
        ()
        {
            Comparable
                <
                String
                >
                c = new String();
            Map<String, String> map = new HashMap<String, String>();
            boolean flag = false;
            int init = 9;
            
            /*ok*/ for (Map.Entry<String, String> entry :
                map.entrySet())
            {
                /*warn*/int i = flag == true ?
                        1 : 2;
            }
            
            /*warn*/ if (init !=
                    9)
            {
                
            }
            
            /*warn*/ while (init ==
                    10)
            {
                
            }
            
            /*warn*/ if (init >
                    10)
            {
                
            } else {}
            
            /*warn*/ while (init < 10 ||
                    !flag) {
                
            }
        }
    };
}

class AsInput {
    int abc = 0;
    String string
        = "string"; // warn
    double PI = // ok
            3.1415;
}

class Ternary {
    void foo() {
        boolean flag = true;
        /*warn*/int i = flag == true ?
                1 : 
                2;
        int i2 = flag == true 
                ?
                1 
                : 
                2;
        int i3 = flag == true 
                ? 1
                : 2;
        
    }
}

class AssignClass {
    void foo() {
        int i = 0;
        int j = 0;
        i +=
                1; //warn
        j
             += 2;
        i -=
                1; //warn
        j
             -= 2;
        i /=
                1; //warn
        j
             /= 2;
        i *=
                1; //warn
        j
             *= 2;
        i %=
                1; //warn
        j
             %= 2;
        i ^=
                1; //warn
        j
             ^= 2;
        i |=
                1; //warn
        j
             |= 2;
        i &=
                1; //warn
        j
             &= 2;
        i >>=
                1; //warn
        j
            >>= 2;
        i >>>=
                1; //warn
        j
            >>>= 2;
        i <<=
                1; //warn
        j
            <<= 2;
    }
    
    class InnerClass {
        void foo() {
            int i = 0;
            int j = 0;
            i +=
                    1; //warn
            j
                 += 2;
            i -=
                    1; //warn
            j
                 -= 2;
            i /=
                    1; //warn
            j
                 /= 2;
            i *=
                    1; //warn
            j
                 *= 2;
            i %=
                    1; //warn
            j
                 %= 2;
            i ^=
                    1; //warn
            j
                 ^= 2;
            i |=
                    1; //warn
            j
                 |= 2;
            i &=
                    1; //warn
            j
                 &= 2;
            i >>=
                    1; //warn
            j
                >>= 2;
            i >>>=
                    1; //warn
            j
                >>>= 2;
            i <<=
                    1; //warn
            j
                <<= 2;
        }
    }
    
    InnerClass anon = new InnerClass() {
        void foo() {
            int i = 0;
            int j = 0;
            i +=
                    1; //warn
            j
                 += 2;
            i -=
                    1; //warn
            j
                 -= 2;
            i /=
                    1; //warn
            j
                 /= 2;
            i *=
                    1; //warn
            j
                 *= 2;
            i %=
                    1; //warn
            j
                 %= 2;
            i ^=
                    1; //warn
            j
                 ^= 2;
            i |=
                    1; //warn
            j
                 |= 2;
            i &=
                    1; //warn
            j
                 &= 2;
            i >>=
                    1; //warn
            j
                >>= 2;
            i >>>=
                    1; //warn
            j
                >>>= 2;
            i <<=
                    1; //warn
            j
                <<= 2;
        }
    };
}
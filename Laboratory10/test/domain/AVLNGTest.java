/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package domain;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.testng.annotations.Test;

/**
 *
 * @author Profesor Gilberth Chaves A <gchavesav@ucr.ac.cr>
 */
public class AVLNGTest {

    @Test
    public void test() {
        try {
            AVL avl = new AVL();
            for (int i = 0; i < 10; i++) {
                int value = util.Utility.random(99);
                avl.add(value);
                System.out.println("AVL item ["+value+"] height: " 
                        +avl.height(value));
            }
            System.out.println(avl.toString());
            System.out.println("AVL Tree min elemnt: "+avl.min());
            System.out.println("AVL Tree max element: "+avl.max());
            System.out.println("AVL Tree height: "+avl.height()); //altura del arbol
            System.out.println("AVL Tree is balanced? "+avl.isBalanced());
            
            System.out.println("DELETING ELEMENTS...");
            int counter = 0;
            do{
                int value = util.Utility.random(99);
                if(avl.contains(value)){
                    System.out.println("AVL item ["+value+"] has been deleted");
                    avl.remove(value);
                    counter++;
                }

            }while(counter<2);
            System.out.println(avl.toString());
            
        } catch (TreeException ex) {
                Logger.getLogger(BSTNGTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

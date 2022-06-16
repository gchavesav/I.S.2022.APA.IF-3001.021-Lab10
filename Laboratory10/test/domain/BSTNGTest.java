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
public class BSTNGTest {
    

    @Test
    public void test() {
        try {
            BST bst = new BST();
            for (int i = 0; i < 10; i++) {
                int value = util.Utility.random(99);
                bst.add(value);
                System.out.println("BST item ["+value+"] height: " 
                        +bst.height(value));
            }
            System.out.println(bst.toString());
            System.out.println("BST Tree min elemnt: "+bst.min());
            System.out.println("BST Tree max element: "+bst.max());
            System.out.println("BST Tree height: "+bst.height()); //altura del arbol
            
            System.out.println("DELETING ELEMENTS...");
            int counter = 0;
            do{
                int value = util.Utility.random(99);
                if(bst.contains(value)){
                    System.out.println("BST item ["+value+"] has been deleted");
                    bst.remove(value);
                    counter++;
                }

            }while(counter<2);
            System.out.println(bst.toString());
            
        } catch (TreeException ex) {
                Logger.getLogger(BSTNGTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

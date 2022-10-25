/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.*;
/**
 *
 * @author Stallion
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        int num=1;
        String option=JOptionPane.showInputDialog("Choose the following option:\n Choose 1 to Add two Complex Numbers \n Choose 2 to Subtruct two Complex Numbers \n Choose 3 to Divide two Complex Numbers \n Choose 4 to Multiply two Complex Numbers\n Choose n to fing sine of Complex Number\n Choose c to find cosine of Complex Number\n Choose t to find tangent Complex Number\n  Choose 0 to Close the program");
            num=Integer.parseInt(option);
        String input=null;
         Scanner obj= new Scanner(System.in);
         double x=obj.nextDouble ();
         double y=obj.nextDouble  ();
         double a=obj.nextDouble  ();
         double b=obj.nextDouble  ();
         
          String[] arr=input.split(",");
                switch(num){
                    case 1:
                        
                      input= JOptionPane.showInputDialog(null,"Adding complex number, Enter the complex numbers");
                   
                      ComplexNumber obj1=new ComplexNumber(x,y);
                      ComplexNumber obj2=new ComplexNumber(a,b);
                      obj1=obj1.addition(obj2);
                              JOptionPane.showMessageDialog(null,obj1.real+"+"+obj1.img+"i");
                              break;
                    case 2:
                         input= JOptionPane.showInputDialog(null,"subtructing complex number, Enter the complex numbers");
                      
                      ComplexNumber obj3=new ComplexNumber(x,y);
                      ComplexNumber obj4=new ComplexNumber(a,b);
                      obj3=obj3.subtruction(obj4);
                              JOptionPane.showMessageDialog(null,obj3.real+"+"+obj3.img+"i");
                              break;
                    case 3:
                        input= JOptionPane.showInputDialog(null,"Dividing complex number, Enter the complex numbers");
                      
                      ComplexNumber obj5=new ComplexNumber(x,y);
                      ComplexNumber obj6=new ComplexNumber(a,b);
                      obj5=obj5.divide(obj6);
                              JOptionPane.showMessageDialog(null,obj5.real+"+"+obj5.img+"i");
                              break;
                    case 4:
                         input= JOptionPane.showInputDialog(null,"Multiplying complex number, Enter the complex numbers");
                      
                      ComplexNumber obj7=new ComplexNumber(x,y);
                      ComplexNumber obj8=new ComplexNumber(a,b);
                      obj7=obj7.divide(obj8);
                              JOptionPane.showMessageDialog(null,obj7.real+"+"+obj7.img+"i");
                     case 's':
                         
                         break;
                         case 'c':
                             
                             break;
                             case 't':
                                 
                                 break;
                    case 0:
                        System.out.println("Program Closed Successfully");
                    break;
                }
            
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpoint.spring.log4j;

/**
 *
 * @author ayrat
 */
public class HelloWorld {

    private String message;

    public void setMessage(String msg) {
        this.message = msg;
    }

    public void getMessage() {
        System.out.println("You have a message:" + message);
    }
    
//     public void printThrowException(){
//	   System.out.println("Exception raised");
//       throw new IllegalArgumentException();
//   }
}

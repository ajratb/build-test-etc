/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.npopm.chess715;

/**
 *
 * @author ayrat
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class FirstClass extends JFrame {

    FirstClass() {
        super("First Class !!!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton button = new JButton();
         button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Здесь будет выполняться код");
            }
        });

        getContentPane().add(button);

        //getContentPane().setLayout(new BoxLayout(this, WIDTH));
        setSize(500, 300);
        setVisible(true);

    }

    public static void main(String[] args) {
        System.out.println((new FirstClass()).toString());
    }

}

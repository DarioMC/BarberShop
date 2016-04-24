/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberia;

import java.awt.Color;
import java.awt.Frame;

/**
 *
 * @author jafeth
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
        mw.getContentPane().setBackground(new Color(20, 30, 70));
        mw.setVisible(true);
    }
    
}

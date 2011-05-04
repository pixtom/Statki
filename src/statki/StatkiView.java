/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package statki;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author pixel
 */
public class StatkiView extends JFrame {

    JPanel topPanel=null,bottomPanel=null, leftPanel,rightPanel;
    JLabel yourMapLabel, opponentLabel,logLabel, chatLabel,msgLabel;
    JButton sendButton;
    JTextField sendField;
    JTextArea statusArea,msgArea;

    public StatkiView()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        initLayout();

        setSize(800,600);
    }


    private void initLayout()
    {
        Container c = getContentPane();
        c.setLayout(new BoxLayout(c,BoxLayout.Y_AXIS));

        //top panel
        topPanel = new JPanel(new GridLayout(2, 2));
        topPanel.setVisible(true);

        //label yours and yours opponent
        yourMapLabel = new JLabel("Twoja plansza");
        opponentLabel = new JLabel("Plansza przeciwnika");

        //left/right panel
        leftPanel = new JPanel(new GridLayout(10, 10));

        topPanel.add(yourMapLabel);
        topPanel.add(opponentLabel);
        topPanel.add(leftPanel);
        


        //bottom panel
        bottomPanel = new JPanel(new GridLayout(2, 2));
        bottomPanel.setVisible(true);

        c.add(topPanel);
        c.add(bottomPanel);




    }

}

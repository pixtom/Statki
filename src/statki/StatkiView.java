/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package statki;

import java.awt.CardLayout;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author pixel
 */
public class StatkiView extends JFrame {

    JPanel yourPanel, opponentPanel,rightPanel,settingPanel;
    JLabel yourMapLabel, opponentLabel,logLabel, chatLabel;
    JButton sendButton;
    JButton myMap[][];
    JButton opponentMap[][];
    JTextField sendField;
    JTextArea statusArea,msgArea;
    final int size=24;
    

    public StatkiView()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        initLayout();
        initMenu();
        setTitle("Statki");

        setSize(900,600);
    }


    private void initLayout()
    {
        Container c = getContentPane();
        c.setLayout(null);

        //label yours and yours opponent
        yourMapLabel = new JLabel("Twoja plansza");
        opponentLabel = new JLabel("Plansza przeciwnika");
        yourMapLabel.setBounds(80, 10, 300, 30);
        opponentLabel.setBounds(380, 10, 300, 30);

        
        //left panel
        yourPanel = new JPanel(null);
        yourPanel.setBounds(20, 50, 10*size, 10*size);

        //right panel
        rightPanel = new JPanel(new CardLayout());
        rightPanel.setBounds(320, 50, 10*size, 10*size);

        opponentPanel = new JPanel(null);
        opponentPanel.setBounds(0, 0, 0, 300);
        settingPanel = new JPanel(null);
        settingPanel.setBounds(0, 0, 10*size, 10*size);

        rightPanel.add(opponentPanel,"opponent");
        rightPanel.add(settingPanel,"setting");
        CardLayout cl = (CardLayout)rightPanel.getLayout();
        cl.show(rightPanel, "opponent");


        logLabel = new JLabel("Aktualnie wykonane operacje");
        logLabel.setBounds(600, 10, 200, 30);

        statusArea = new JTextArea();
        statusArea.setBounds(600, 50, 270, 500);

        chatLabel = new JLabel("Rozmowa");
        chatLabel.setBounds(20, 300, 240, 30);

        msgArea = new JTextArea();
        msgArea.setBounds(20, 340, 530, 150);

        sendField = new JTextField();
        sendField.setBounds(20, 500, 530, 30);
        

        c.add(yourMapLabel);
        c.add(opponentLabel);
        c.add(yourPanel);
        c.add(rightPanel);
        c.add(logLabel);
        c.add(statusArea);
        c.add(chatLabel);
        c.add(msgArea);
        c.add(sendField);

        createButtonMap(yourPanel,myMap , 24);
        createButtonMap(opponentPanel,opponentMap , 24);


    }

    private void createButtonMap(JPanel p,JButton map[][],int btnSize)
    { 
        map = new JButton[10][10];

        p.setLayout(null);
        for( int y=0;y<10;y++)
        {
            for( int x=0;x<10;x++)
            {
                map[x][y]= new JButton();
                p.add(map[x][y]);
                map[x][y].setVisible(true);                
                map[x][y].setSize(btnSize,btnSize);
                map[x][y].setLocation(x*btnSize,y*btnSize);

            }
        }
    }

    private void initMenu()
    {
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("Plik");
        menuBar.add(fileMenu);
        JMenuItem newGameItem = new JMenuItem("Nowa gra");
        fileMenu.add(newGameItem);
        newGameItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
        JMenuItem closeItem = new JMenuItem("Zamknij");
        fileMenu.add(closeItem);
        closeItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        JMenu settingsMenu = new JMenu("Ustawienia");
        menuBar.add(settingsMenu);
        JMenu gameTypeMenu = new JMenu("Typ Gry");
        settingsMenu.add(gameTypeMenu);

        ButtonGroup gameTypeGroup = new ButtonGroup();
        JRadioButtonMenuItem HvsC_Item = new JRadioButtonMenuItem("Human vs Computer");
        HvsC_Item.setSelected(true);
        gameTypeGroup.add(HvsC_Item);
        gameTypeMenu.add(HvsC_Item);

        JRadioButtonMenuItem HvsH_Item = new JRadioButtonMenuItem("Human vs Human");
        gameTypeGroup.add(HvsH_Item);
        gameTypeMenu.add(HvsH_Item);

        settingsMenu.addSeparator();

        ButtonGroup applicationType = new ButtonGroup();
        JMenu applicationTypeMenu = new JMenu("Typ Aplikacji");
        settingsMenu.add(applicationTypeMenu);

        JRadioButtonMenuItem clientItem = new JRadioButtonMenuItem("Klient");
        clientItem.setSelected(true);
        applicationType.add(clientItem);
        applicationTypeMenu.add(clientItem);

        JRadioButtonMenuItem serverItem = new JRadioButtonMenuItem("Serwer");
        applicationType.add(serverItem);
        applicationTypeMenu.add(serverItem);

        JMenu helpMenu = new JMenu("Pomoc");
        menuBar.add(helpMenu);
        JMenuItem aboutItem = new JMenuItem("About");
        helpMenu.add(aboutItem);
        aboutItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
        

    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package statki;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author pixel
 */
public class StatkiView extends JFrame {
    public StatkiView()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        initMenu();

        setSize(800,600);
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

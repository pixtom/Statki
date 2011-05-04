/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package statki;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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
        JMenuItem newGameItem = new JMenuItem("Nowa gra");
        fileMenu.add(newGameItem);
        JMenuItem closeItem = new JMenuItem("Zamknij");
        fileMenu.add(closeItem);
        menuBar.add(fileMenu);
        
        JMenu gameTypeMenu = new JMenu("Typ Gry");
        menuBar.add(gameTypeMenu);
        
        JMenu applicationTypeMenu = new JMenu("Typ Aplikacji");
        menuBar.add(applicationTypeMenu);

        JMenu helpMenu = new JMenu("Pomoc");
        menuBar.add(helpMenu);

    }

}

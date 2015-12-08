import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Flags extends JFrame {

	public Flags() {
		DisplayPanel flagContent = new DisplayPanel();
		add(flagContent, BorderLayout.CENTER);

		// create 3 buttons and button panel
		JPanel buttonPanel = new JPanel();
		JButton japan = new JButton("Japan"); // flowLayout
		buttonPanel.add(japan);
		japan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flagContent.setFlag('j');
				flagContent.repaint();
			}
		});

		JButton france = new JButton("France"); // flowLayout
		buttonPanel.add(france);
		france.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flagContent.setFlag('f');
				flagContent.repaint();
			}
		});

		JButton mauritus = new JButton("Mauritus");
		buttonPanel.add(mauritus);
		mauritus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flagContent.setFlag('m');
				flagContent.repaint();
			}
		});

		// add button panel to Jframe
		add(buttonPanel, BorderLayout.SOUTH);

		// add menus
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		// program menu options
		JMenu program = new JMenu("Program");
		menuBar.add(program);
		// about menu option
		JMenuItem about = program.add("About");
		// program.add(about);
		about.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								getContentPane(),
								new JLabel(
										"<html><hr><i>This program displays 3 different flags.</i></html>"),
								"About Fun With Flags",
								JOptionPane.PLAIN_MESSAGE);
			}
		});
		// exit menu option
		JMenuItem exit = program.add("Exit");
		// program.add(exit);
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		// flags menu options
		JMenu flagsMenu = new JMenu("Flags");
		menuBar.add(flagsMenu);

		// japan menu option
		JMenuItem japanMenu = flagsMenu.add("Japan");
		// flagsMenu.add(japanMenu);
		japanMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flagContent.setFlag('j');
				flagContent.repaint();
			}
		});
		// france menu option
		JMenuItem franceMenu = flagsMenu.add("France");
		// flagsMenu.add(franceMenu);
		franceMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flagContent.setFlag('f');
				flagContent.repaint();
			}
		});
		// mauritus menu option
		JMenuItem mauritusMenu = flagsMenu.add("Mauritus");
		// flagsMenu.add(mauritusMenu);
		mauritusMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flagContent.setFlag('m');
				flagContent.repaint();
			}
		});

		setVisible(true);
		// set to specified size
		setSize(600, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Flags();

	}
}

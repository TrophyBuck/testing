import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DisplayPanel extends JPanel {

	private char flag;
	private int width;
	private int height;

	public DisplayPanel() {
		flag = ' ';
		width = 600;
		height = 400;
		setMinimumSize(new Dimension(width, height));
	}

	public void setFlag(char f) {
		flag = f;
	}

	@Override
	protected void paintComponent(Graphics g) {
		if (flag == 'f') {
			// System.out.println("france");

			g.setColor(Color.BLUE);
			g.fillRect(0, 0, (width / 3), height);
			g.setColor(Color.WHITE);
			g.fillRect((width / 3), 0, (width / 3), height);
			g.setColor(Color.RED);
			g.fillRect(width * 2 / 3, 0, (width / 3), height);

		} else if (flag == 'j') {
			// System.out.println("japan");
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, width, height);
			g.setColor(Color.RED);
			g.fillOval(width / 2 - height * 3 / 10, height / 5, height * 3 / 5,
					height * 3 / 5);

		} else if (flag == 'm') {
			// System.out.println("mauritus");

			g.setColor(Color.GREEN);
			g.fillRect(0, 0, width, height / 4);
			g.setColor(Color.YELLOW);
			g.fillRect(0, height / 4, width, height / 4);
			g.setColor(Color.BLUE);
			g.fillRect(0, height / 2, width, height / 4);
			g.setColor(Color.RED);
			g.fillRect(0, height * 3 / 4, width, height / 4);
		}
	}
}

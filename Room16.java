package RoomDetails;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTable;

import ROOMS.Room1;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Room16 extends JFrame implements ActionListener {
	Room1 r;
	JTable table;
	private JFrame frame;

	Room16() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 255, 255));
		frame.setBounds(0, 0, 833, 376);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Room7.jpg"));
		lblNewLabel.setBounds(10, 25, 354, 275);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("RoomD.png"));
		lblNewLabel_1.setBounds(374, 25, 433, 229);
		frame.getContentPane().add(lblNewLabel_1);

		JButton btnNewButton = new JButton("Comform");
		btnNewButton.setBackground(new Color(240, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(436, 277, 113, 35);
		frame.getContentPane().add(btnNewButton);

		JButton btnBack = new JButton("BACK ");
		btnBack.setBackground(new Color(240, 248, 255));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBack.setBounds(649, 277, 113, 35);
		frame.getContentPane().add(btnBack);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new Room16();
	}
}
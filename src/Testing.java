import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSlider;
import java.awt.Color;
import javax.swing.JButton;

public class Testing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Testing frame = new Testing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Testing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u03A3\u03B1\u03C2 \u03B5\u03C5\u03C7\u03B1\u03C1\u03B9\u03C3\u03C4\u03BF\u03CD\u03BC\u03B5 \u03B3\u03B9\u03B1 \u03C4\u03B7\u03BD \u03C0\u03B1\u03C1\u03B1\u03B3\u03B3\u03B5\u03BB\u03AF\u03B1 \u03C3\u03B1\u03C2. ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(132, 10, 303, 67);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0391\u03BD \u03B8\u03AD\u03BB\u03B5\u03C4\u03B5 \u03BC\u03C0\u03BF\u03C1\u03B5\u03AF\u03C4\u03B5 \u03BD\u03B1 \u03BC\u03B1\u03C2 \u03B1\u03BE\u03B9\u03BF\u03BB\u03BF\u03B3\u03AE\u03C3\u03B5\u03C4\u03B5. \u039C\u03B1\u03C2 \u03B5\u03BD\u03B4\u03B9\u03B1\u03C6\u03AD\u03C1\u03B5\u03B9 \u03B7 \u03AC\u03C0\u03BF\u03C8\u03AE \u03C3\u03B1\u03C2!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(53, 62, 484, 67);
		contentPane.add(lblNewLabel_1);
		
		JSlider slider = new JSlider();
		slider.setValue(3);
		slider.setFont(new Font("Tahoma", Font.PLAIN, 14));
		slider.setPaintTicks(true);
		slider.setMinimum(1);
		slider.setMaximum(5);
		slider.setBounds(93, 220, 407, 77);
		contentPane.add(slider);
		
		JLabel lblNewLabel_2 = new JLabel("1");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(109, 324, 78, 34);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("2");
		lblNewLabel_3.setForeground(Color.ORANGE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(208, 324, 77, 34);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("3");
		lblNewLabel_4.setForeground(new Color(255, 140, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(295, 324, 78, 34);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("4");
		lblNewLabel_5.setForeground(new Color(0, 204, 51));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(383, 324, 79, 34);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("5");
		lblNewLabel_6.setForeground(new Color(51, 153, 51));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(472, 324, 65, 34);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("\u039F\u039A");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(487, 385, 110, 40);
		contentPane.add(btnNewButton);
	}
}

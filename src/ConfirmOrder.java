import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class ConfirmOrder extends JFrame {
	
	JButton confirmorderbtn = new JButton("\u039F\u03BB\u03BF\u03BA\u03BB\u03AE\u03C1\u03C9\u03C3\u03B7 \u03C0\u03B1\u03C1\u03B1\u03B3\u03B3\u03B5\u03BB\u03AF\u03B1\u03C2");
	JTextArea order = new JTextArea();
	JTextArea totalcostshown = new JTextArea();
	int pmchosen=0;
	int dtchosen=0;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmOrder frame = new ConfirmOrder();
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
	public ConfirmOrder() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 552, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 516, 317);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//JTextArea order = new JTextArea();
		order.setEditable(false);
		order.setBounds(10, 0, 235, 317);
		panel.add(order);
		
		JLabel totalcost = new JLabel("\u03A3\u03CD\u03BD\u03BF\u03BB\u03BF:");
		totalcost.setBounds(289, 11, 46, 14);
		panel.add(totalcost);
		
		totalcostshown.setEditable(false);
		totalcostshown.setBounds(345, 11, 72, 14);
		panel.add(totalcostshown);
		
		JLabel lblNewLabel = new JLabel("\u03A4\u03C1\u03CC\u03C0\u03BF\u03C2 \u03A0\u03BB\u03B7\u03C1\u03C9\u03BC\u03AE\u03C2:");
		lblNewLabel.setBounds(289, 36, 135, 14);
		panel.add(lblNewLabel);
		
		JRadioButton cash = new JRadioButton("\u039C\u03B5\u03C4\u03C1\u03B7\u03C4\u03AC");
		cash.setBounds(289, 57, 109, 23);
		cash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pmchosen++;
				enablebutton(pmchosen,dtchosen);
		}});

		panel.add(cash);
		
		JRadioButton card = new JRadioButton("\u03A7\u03C1\u03B5\u03C9\u03C3\u03C4\u03B9\u03BA\u03AE/\u03C0\u03B9\u03C3\u03C4\u03C9\u03C4\u03B9\u03BA\u03AE \u03BA\u03AC\u03C1\u03C4\u03B1");
		card.setBounds(289, 83, 197, 23);
		card.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pmchosen++;
				enablebutton(pmchosen,dtchosen);
		}});

		panel.add(card);
		
		ButtonGroup payment=new ButtonGroup();
		payment.add(card);
		payment.add(cash);
		
		JLabel ordertype = new JLabel("\u03A4\u03CD\u03C0\u03BF\u03C2 \u03C0\u03B1\u03C1\u03B1\u03B3\u03B3\u03B5\u03BB\u03AF\u03B1\u03C2:");
		ordertype.setBounds(289, 126, 149, 14);
		panel.add(ordertype);
		
		JRadioButton takeaway = new JRadioButton("Takeaway\r\n\r\n");
		takeaway.setBounds(289, 147, 109, 23);
		takeaway.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dtchosen++;
				enablebutton(pmchosen,dtchosen);
		}});

		panel.add(takeaway);
		
		JRadioButton sit = new JRadioButton("\u03A3\u03C4\u03BF \u03BA\u03B1\u03C4\u03AC\u03C3\u03C4\u03B7\u03BC\u03B1");
		sit.setBounds(289, 173, 109, 23);
		sit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dtchosen++;
				enablebutton(pmchosen,dtchosen);
		}});
		panel.add(sit);
		
		ButtonGroup ordering=new ButtonGroup();
		ordering.add(takeaway);
		ordering.add(sit);
		
		confirmorderbtn.setEnabled(false);
		confirmorderbtn.setBounds(271, 263, 235, 43);
		panel.add(confirmorderbtn);
		
	}
		public void lastdetails(double total,String[] items,int[] quantity,double[] prices) {
			order.selectAll();
			order.replaceSelection("");
			 for (int i=0;i<23;i++) {
				if (quantity[i]>0) {
					order.append(quantity[i]+".00 X "+items[i]+"  "+ quantity[i]*prices[i] + "\n");
				}
			}
			totalcostshown.setText(""+total);		
		}
		
		public void enablebutton(int pm,int dm) {
			if(pm>0&&dm>0) {
				confirmorderbtn.setEnabled(true);
			}
		}
}

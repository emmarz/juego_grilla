package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Font;

/*Clase para probarla en la main . Es una copia de MainWindow pero adaptada para poder llamarla*/
public class Prueba extends JFrame {

	private JPanel body_center;
	private JPanel body_grid;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JPanel foot;
	private JPanel head;
	private JPanel body_left;
	private JPanel body_right;
	private JPanel panel_2;
	private JPanel panel_3;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;

	/**
	 * Launch the application.
	 */
/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba window = new prueba();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	public Prueba() {
		setBounds(100, 100, 494, 379);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		body_center = new JPanel();
		getContentPane().add(body_center, BorderLayout.CENTER);
		body_center.setLayout(new BorderLayout(0, 0));
		
		body_grid = new JPanel();
		body_grid.setToolTipText("hola");
		body_grid.setBorder(new LineBorder(new Color(255, 0, 0)));
		body_center.add(body_grid, BorderLayout.CENTER);
		body_grid.setLayout(new GridLayout(4, 4, 0, 0));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		body_grid.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		body_grid.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		body_grid.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		body_grid.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		body_grid.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		body_grid.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		body_grid.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setColumns(10);
		body_grid.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setColumns(10);
		body_grid.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setColumns(10);
		body_grid.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setColumns(10);
		body_grid.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setColumns(10);
		body_grid.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setColumns(10);
		body_grid.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setColumns(10);
		body_grid.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setColumns(10);
		body_grid.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setColumns(10);
		body_grid.add(textField_15);
		
		foot = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) foot.getLayout();
		flowLayout_1.setVgap(20);
		flowLayout_1.setHgap(20);
		getContentPane().add(foot, BorderLayout.SOUTH);
		
		head = new JPanel();
		head.setBackground(new Color(0, 0, 0));
		FlowLayout flowLayout = (FlowLayout) head.getLayout();
		flowLayout.setVgap(20);
		flowLayout.setHgap(20);
		getContentPane().add(head, BorderLayout.NORTH);
		
		body_left = new JPanel();
		body_left.setBackground(new Color(0, 0, 0));
		FlowLayout fl_body_left = (FlowLayout) body_left.getLayout();
		fl_body_left.setVgap(0);
		fl_body_left.setHgap(40);
		getContentPane().add(body_left, BorderLayout.WEST);
		
		body_right = new JPanel();
		getContentPane().add(body_right, BorderLayout.EAST);
		body_right.setLayout(new BorderLayout(0, 0));
		
		panel_2 = new JPanel();
		body_right.add(panel_2, BorderLayout.EAST);
		panel_2.setLayout(new GridLayout(4, 1, 0, 0));
		
		textField_16 = new JTextField();
		textField_16.setForeground(new Color(0, 0, 0));
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setBackground(new Color(192, 192, 192));
		panel_2.add(textField_16);
		textField_16.setColumns(3);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setColumns(3);
		textField_17.setBackground(Color.LIGHT_GRAY);
		panel_2.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setColumns(3);
		textField_18.setBackground(Color.LIGHT_GRAY);
		panel_2.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setColumns(3);
		textField_19.setBackground(Color.LIGHT_GRAY);
		panel_2.add(textField_19);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout_3 = (FlowLayout) panel_3.getLayout();
		flowLayout_3.setHgap(10);
		body_right.add(panel_3, BorderLayout.WEST);
	}

}

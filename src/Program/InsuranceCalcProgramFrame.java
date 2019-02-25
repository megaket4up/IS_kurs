package Program;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class InsuranceCalcProgramFrame extends JFrame 
{
	private static final long serialVersionUID = 1L;
	
	// controls
	private JPanel contentPane;
		
	private JTextField textPeriod;
	private JTextField textPower;
	private JTextField textExperience;
	private JTextField textCost;

	// entry point
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					InsuranceCalcProgramFrame frame = new InsuranceCalcProgramFrame();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	// handling the button click event
	private void Calculate()
	{
		// TODO: Create an event handler for clicking a button, 
		//       which intercepts data from text input fields, and outputting the result to the output fields.
		//       Organize an error handling via try/catch mechanism.
		//       Issue error message via JOptionPane.showMessageDialog() method.
		//       Use the InsurancePolicyCalcBL class for calculations.
		double period = 0;
		double power = 0; 
		double experience = 0;
		
		// try to execute this code 
		try {
			period = Double.parseDouble(textPeriod.getText()); 
			power = Double.parseDouble(textPower.getText()); 
			experience = Double.parseDouble(textExperience.getText());
		}
		
		// if throws exception 
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid input. Please, try again.");
			textPeriod.setText(""); 
			textPower.setText(""); 
			textExperience.setText(""); 
			textCost.setText("");
			
			return; 
		}
		
		// creating exemplar of class InsurancePolicyCalcBL
		InsurancePolicyCalcBL fc = new InsurancePolicyCalcBL(period, power, experience);
		textCost.setText(String.format(new Locale("ru"), "%(.2f", fc.getCost()));
	}
	
	// component configuration
	public InsuranceCalcProgramFrame() 
	{
		setResizable(false);
		setTitle("Страховой калькулятор");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 205);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Период страхования(мес):");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(24, 11, 140, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Мощность автомобиля(лс):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(24, 36, 153, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Стаж вождения(г):");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(24, 61, 146, 14);
		contentPane.add(lblNewLabel_2);
		
		textPeriod = new JTextField();
		textPeriod.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textPeriod.setBounds(180, 8, 114, 20);
		contentPane.add(textPeriod);
		textPeriod.setColumns(10);
		
		textPower = new JTextField();
		textPower.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textPower.setBounds(180, 33, 114, 20);
		contentPane.add(textPower);
		textPower.setColumns(10);
		
		textExperience = new JTextField();
		textExperience.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textExperience.setBounds(180, 58, 114, 20);
		contentPane.add(textExperience);
		textExperience.setColumns(10);
		
		JButton btnCalculate = new JButton("Расcчитать");
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCalculate.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				Calculate();
			}
		});
		btnCalculate.setBounds(180, 97, 114, 23);
		contentPane.add(btnCalculate);
		
		JLabel lblNewLabel_3 = new JLabel("Стоимость страхования:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(24, 143, 130, 14);
		contentPane.add(lblNewLabel_3);
				
		textCost = new JTextField();
		textCost.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textCost.setBounds(180, 140, 114, 20);
		contentPane.add(textCost);
		textCost.setColumns(10);
	}
}



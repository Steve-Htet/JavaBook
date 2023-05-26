/**
 * @(#)RandomNumber.java
 *
 *
 * @author 
 * @version 1.00 2011/1/15
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class RandomNumber extends JFrame implements ActionListener
{
	static JTextField numberTextField=new JTextField();
	static JButton randomButton=new JButton();
	static Random myRandom=new Random();
	public static void main(String args[])
	{
		new RandomNumber().show();
		
	}
	public RandomNumber()
	{
		setTitle("Random Number Problem");
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				exitForm(e);
			}
		});
	getContentPane().setLayout(new GridBagLayout());
	GridBagConstraints gridConstraints=new GridBagConstraints();
	numberTextField.setText(" ");
	numberTextField.setColumns(10);
	gridConstraints.gridx=0;
	gridConstraints.gridy=0;
	getContentPane().add(numberTextField,gridConstraints);
	
	randomButton.setText("Random Number");
	gridConstraints.gridx=0;
	gridConstraints.gridy=1;
	getContentPane().add(randomButton,gridConstraints);
	randomButton.addActionListener(this);
	pack();
	
	}
	private void exitForm(WindowEvent e)
	{
		System.exit(0);
	}
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==randomButton)
    	{
    			
    		int num=myRandom.nextInt(2)+1;
    		numberTextField.setText(String.valueOf(num));
    	}
    		
    }	
}
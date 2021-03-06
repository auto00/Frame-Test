package frametest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.Calculation_lib;

public class Frame_view extends Frame implements ActionListener, WindowListener{

	private TextField text1 = new TextField("", 10);
	private TextField text2 = new TextField("", 10);
	private TextField text3 = new TextField("", 10);
	private Button button1 = new Button("�����Z");
	private Button button2 = new Button("�����Z");
	private Button button3 = new Button("�|���Z");
	private Button button4 = new Button("����Z");
	
	
	public Frame_view() {
		addWindowListener(this);
		setTitle("FrameTest");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(text1);
		add(text2);
		add(button1);
		button1.addActionListener(this);
		add(button2);
		button2.addActionListener(this);
		add(button3);
		button3.addActionListener(this);
		add(button4);
		button4.addActionListener(this);
		add(new Label("="));
		add(text3);
	}
	
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double val1 = Double.parseDouble(text1.getText());
		double val2 = Double.parseDouble(text2.getText());
		//text3.setText(String.valueOf(val1 + val2));
		if(e.getSource() == button1) {
			Calculation_lib clib = new Calculation_lib(val1, val2);
		    text3.setText(String.valueOf(clib.getPlus()));
	    }else if(e.getSource() == button2) {
			Calculation_lib clib = new Calculation_lib(val1, val2);
		    text3.setText(String.valueOf(clib.getMinus()));
	    }else if(e.getSource() == button3) {
			Calculation_lib clib = new Calculation_lib(val1, val2);
		    text3.setText(String.valueOf(clib.getTime()));
	    }else if(e.getSource() == button4) {
			Calculation_lib clib = new Calculation_lib(val1, val2);
		    text3.setText(String.valueOf(clib.getDivide()));
	    }
	}

}

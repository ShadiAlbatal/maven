package se.nackademin.onlinetest;

/*Online Java Paper Test*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



class OnlineTest extends JFrame implements ActionListener
{
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;
	ButtonGroup bg;
	int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[12];
	OnlineTest(String s)
	{
		super(s);
		l=new JLabel();
		add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");
		b2=new JButton("Bookmark");
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(b1);add(b2);
		set();
		l.setBounds(30,40,450,20);
		jb[0].setBounds(50,80,150,20);
		jb[1].setBounds(50,110,150,20);
		jb[2].setBounds(50,140,100,20);
		jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);
		b2.setBounds(270,240,100,30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250,100);
		setVisible(true);
		setSize(600,350);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
				count=count+1;
			current++;
			set();
			if(current==12)
			{
				b1.setEnabled(false);
				b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Bookmark"))
		{
			JButton bk=new JButton("Bookmark"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);
			bk.addActionListener(this);
			m[x]=current;
			x++;
			current++;
			set();
			if(current==12)
				b2.setText("Result");
			setVisible(false);
			setVisible(true);
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
			if(e.getActionCommand().equals("Bookmark"+y))
			{
				if(check())
					count=count+1;
				now=current;
				current=m[y];
				set();
				((JButton)e.getSource()).setEnabled(false);
				current=now;
			}
		}

		if(e.getActionCommand().equals("Result"))
		{
			if(check())
				count=count+1;
			current++;
			//System.out.println("correct ans="+count);
			JOptionPane.showMessageDialog(this,"correct ans="+count);
			System.exit(0);
		}
	}
	public void set()
	{
		GetQuestion.setArray();
		jb[4].setSelected(true);
		if(current==0)
		{
			l.setText(GetQuestion.returnQuestion(current));
			jb[0].setText("int");jb[1].setText("Float");jb[2].setText("boolean");jb[3].setText("char");
		}
		if(current==1)
		{
			l.setText(GetQuestion.returnQuestion(current));
			jb[0].setText("Swing");jb[1].setText("Applet");jb[2].setText("Object");jb[3].setText("ActionEvent");
		}
		if(current==2)
		{
			l.setText(GetQuestion.returnQuestion(current));
			jb[0].setText("wait()");jb[1].setText("start()");jb[2].setText("stop()");jb[3].setText("run()");
		}

		if(current==3)
		{
			l.setText(GetQuestion.returnQuestion(current));
			jb[0].setText("Thread returns to the ready state");
			jb[1].setText("Thread returns to waiting state");
			jb[2].setText("Thread starts running");
			jb[3].setText("None of the above");
		}
		if(current==4)
		{
			l.setText(GetQuestion.returnQuestion(current));
			jb[0].setText("True");jb[1].setText("False");
			jb[2].hide();
			jb[3].hide();
		}
		if(current==5)
		{
			l.setText(GetQuestion.returnQuestion(current));
			jb[2].show();
			jb[3].show();
			jb[0].setText("class");jb[1].setText("int");jb[2].setText("get");jb[3].setText("if");
		}
		if(current==6)
		{
			l.setText(GetQuestion.returnQuestion(current));
			jb[0].setText("Undefined");
			jb[1].setText("0");
			jb[2].setText("Null");
			jb[3].setText("Not defined");
		}
		if(current==7)
		{
			l.setText(GetQuestion.returnQuestion(current));
			jb[0].setText("Instance variables are static variables within a class but outside any method.");
			jb[1].setText("Instance variables are variables defined inside methods, constructors or blocks");
			jb[2].setText("Instance variables are variables within a class but outside any method");
			jb[3].setText("None of the above");
		}
		if(current==8)
		{
			l.setText(GetQuestion.returnQuestion(current));
			jb[0].setText("True");
			jb[1].setText("False");
			jb[2].hide();
			jb[3].hide();
		}
		if(current==9)
		{
			l.setText(GetQuestion.returnQuestion(current));
			jb[2].show();
			jb[3].show();
			jb[0].setText("A - If a subclass uses a method that is already provided by its parent class, it is known as Method Overriding");
			jb[1].setText("If a subclass provides a specific implementation of a method that is already provided by its parent class, it is known as Method Overriding.");
			jb[2].setText("Both of the above");
			jb[3].setText("None of the above");
		}
		if(current==10)
		{
			l.setText(GetQuestion.returnQuestion(current));
			jb[0].setText("True");
			jb[1].setText("False");
			jb[2].setText("do not know");
			jb[3].setText("cannot access static func");
		}
		if (current == 11) {
			l.setText(GetQuestion.returnQuestion(current));
			jb[0].setText("8 bit");
			jb[1].setText("16 bit");
			jb[2].setText(" 32 bit");
			jb[3].setText("64 bit");
		}
		if (current == 12) {
			l.setText(GetQuestion.returnQuestion(current));
			jb[0].setText("u0000");
			jb[1].setText("0");
			jb[2].setText("null");
			jb[3].setText("not defined");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[1].isSelected());
		if(current==1)
			return(jb[2].isSelected());
		if(current==2)
			return(jb[3].isSelected());
		if(current==3)
			return(jb[1].isSelected());
		if(current==4)
			return(jb[1].isSelected());
		if(current==5)
			return(jb[2].isSelected());
		if(current==6)
			return(jb[2].isSelected());
		if(current==7)
			return(jb[2].isSelected());
		if(current==8)
			return(jb[1].isSelected());
		if(current==9)
			return(jb[1].isSelected());
		if(current==10)
			return(jb[0].isSelected());
		if(current==11)
			return(jb[1].isSelected());
		if(current==12)
			return(jb[0].isSelected());
		return false;
	}
	public static void main(String s[])
	{

		new OnlineTest("Online Test Of Java");
	}


}

package class2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExamplee {

	public static void main(String[] args) {
		SwingObserverExamplee examlpe=new SwingObserverExamplee();
		examlpe.go();
	}

	private void go() {
		JFrame frame=new JFrame();
		JButton button=new JButton("Should I do it?");
		button.addActionListener(event -> 
		System.out.println("Don't do it, you might regret it!"));
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Come on ,do it!");
			}
		});
		frame.getContentPane().add(BorderLayout.CENTER, button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300,300);
		frame.setVisible(true);
	}

}

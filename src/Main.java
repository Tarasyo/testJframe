import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame {
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Main();
	}
	
	public Main() {
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("YO-Yo-yo");
		
		JPanel myFirstPanel = new JPanel();
		this.add(myFirstPanel);
		
		JLabel myLable = new JLabel ("Hello My name is Taras");
		myFirstPanel.add(myLable);
		
		JButton myButton = new JButton("Don't click me");
		myFirstPanel.add(myButton);
	}

}

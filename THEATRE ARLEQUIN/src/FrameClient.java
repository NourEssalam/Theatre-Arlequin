
import java.awt.*;
import javax.swing.*;

public class FrameClient extends JFrame {
    

	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	    public  JFrame frame; 
		private JButton reserver; 
	    private JButton annuler;
	    private JButton retour;
	    private JTextField name;
	    private JTextField tel;
	    private JLabel telLabel;
	    private JLabel nameLabel;
	    private JLabel numSiege;
	    private JLabel num;

	    public FrameClient() {
	    	
	    	reserver = new JButton ("Reservation");
	        annuler = new JButton ("Annulation");
	        retour = new JButton ("Retour au Théatre");
	        name = new JTextField (5);
	        tel = new JTextField (5);
	        telLabel = new JLabel  ("Téléphone:");
	        nameLabel = new JLabel ("Nom du client:");
	        numSiege = new JLabel ("Numéro du siège:");
	        num = new JLabel ("Num");

	       
	        
	       
	        add (reserver);
	        add (annuler);
	        add (retour);
	        add (name);
	        add (tel);
	        add (telLabel);
	        add (nameLabel);
	        add (numSiege);
	        add (num);

	        reserver.setBounds (370, 20, 165, 55);
	        annuler.setBounds (370, 95, 165, 55);
	        retour.setBounds (370, 170, 165, 60);
	        name.setBounds (130, 115, 205, 30);
	        tel.setBounds (130, 185, 205, 30);
	        telLabel.setBounds (15, 190, 100, 25);
	        nameLabel.setBounds (15, 120, 110, 25);
	        numSiege.setBounds (10, 50, 135, 25);
	        num.setBounds (185, 35, 70, 55);
	        
	        
	        frame = new JFrame();
	        
	        frame.setSize(567, 350);
	        frame.setLayout(null); 
	        frame.setVisible(true); 
	        Color c1 = new Color(172, 207, 239);
	        frame.getContentPane().setBackground(c1);
	        frame.setLayout (null);

	        
	        // add compositions to frame client 
	        
	        frame.add(reserver);
	        frame.add(annuler);
	        frame.add(retour);
	        frame.add(name);
	        frame.add(tel);
	        frame.add(telLabel);
	        frame.add(nameLabel);
	        frame.add(numSiege);
	        frame.add(num);
	        
	    }


	   
	}


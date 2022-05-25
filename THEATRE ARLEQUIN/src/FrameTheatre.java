
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;


public class FrameTheatre extends JFrame implements ActionListener{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
    JButton siege[];
    
	     JMenuItem newPiece;
	     JMenuItem openPiece;
	     JMenuItem delPiece;
	     JMenuItem quit;



    FrameTheatre(){
    	
    	    
    		siege = new JButton[50];
    		
    	        for(int count = 0; count < 48; count++) {
    	            siege[count] = new JButton(String.valueOf(count+1));
    	            siege[count].setFocusable(false); 
    	            siege[count].addActionListener(this); 
    	            siege[count].setBackground(Color.WHITE);
    	        }
    	        
	    	        siege[0].setBounds (65, 380, 50, 45);
	    	        siege[1].setBounds (115, 365, 50, 45);
	    	        siege[2].setBounds (165, 350, 50, 45);
	    	        siege[3].setBounds (215, 330, 50, 50);
	    	        siege[4].setBounds (265, 315, 50, 45);
	    	        siege[5].setBounds (315, 315, 55, 45);
	    	        siege[6].setBounds (370, 315, 55, 45);
	    	        siege[7].setBounds (420, 315, 55, 45);
	    	        siege[8].setBounds (475, 335, 50, 45);
	    	        siege[9].setBounds (525, 350, 50, 45);
	    	        siege[10].setBounds (575, 365, 50, 45);
	    	        siege[11].setBounds (625, 375, 50, 45);
	    	        siege[12].setBounds (60, 310, 50, 45);
	    	        siege[13].setBounds (110, 290, 50, 45);
	    	        siege[14].setBounds (160, 265, 50, 50);
	    	        siege[15].setBounds (210, 245, 55, 50);
	    	        siege[16].setBounds (265, 230, 50, 45);
	    	        siege[17].setBounds (315, 230, 50, 45);
	    	        siege[18].setBounds (365, 230, 50, 45);
	    	        siege[19].setBounds (415, 230, 55, 45);
	    	        siege[20].setBounds (470, 245, 50, 45);
	    	        siege[21].setBounds (520, 255, 50, 45);
	    	        siege[22].setBounds (570, 275, 50, 45);
	    	        siege[23].setBounds (620, 290, 50, 50);
	    	        siege[24].setBounds (55, 230, 50, 45);
	    	        siege[25].setBounds (105, 210, 50, 45);
	    	        siege[26].setBounds (155, 195, 50, 45);
	    	        siege[27].setBounds (205, 170, 55, 50);
	    	        siege[28].setBounds (260, 150, 55, 50);
	    	        siege[29].setBounds (315, 150, 55, 50);
	    	        siege[30].setBounds (370, 150, 55, 50);
	    	        siege[31].setBounds (420, 150, 55, 50);
	    	        siege[32].setBounds (475, 165, 50, 45);
	    	        siege[33].setBounds (525, 180, 50, 45);
	    	        siege[34].setBounds (575, 200, 50, 45);
	    	        siege[35].setBounds (625, 220, 50, 45);
	    	        siege[36].setBounds  (50, 150, 50, 45);
	    	        siege[37].setBounds (630, 140, 50, 45);
	    	        siege[38].setBounds (100, 135, 50, 45);
	    	        siege[39].setBounds (150, 115, 55, 50);
	    	        siege[40].setBounds (205, 90, 55, 50);
	    	        siege[41].setBounds (260, 75, 55, 50);
	    	        siege[42].setBounds (315, 75, 55, 50);
	    	        siege[43].setBounds (370, 75, 55, 50);
	    	        siege[44].setBounds (425, 75, 55, 50);
	    	        siege[45].setBounds (480, 90, 50, 50);
	    	        siege[46].setBounds (530, 105, 50, 45);
	    	        siege[47].setBounds (580, 120, 50, 45);
    	        
	    	        JLabel theatre = new JLabel("                            théatre"); //25 
	    	        theatre.setFocusable(false); 
	    	        theatre.setBounds (270, 505, 205, 50);
	    	        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
	    	        theatre.setBorder(border);
	    	        
	    	        // Menu Bar
		    	        
	    	        JMenuBar menu= new JMenuBar(); //38 
		            menu.setFocusable(false);
	    	        menu.setBounds (0, 0, 755, 25);
    	        
    	           // Menu 
    	        
	          		 JMenu fileMenu = new JMenu ("File");
	          	           newPiece = new JMenuItem ("Nouvelle piéce");
	          	           fileMenu.add (newPiece);
	          	           openPiece = new JMenuItem ("Ouvrire piéce");
	          	           fileMenu.add (openPiece);
	          	           delPiece = new JMenuItem ("Supprimer piéce");
	          	           fileMenu.add (delPiece);
	          	           quit = new JMenuItem ("Quitter");
	          	           fileMenu.add (quit);
          	        
          	        
       	        
	       	        // add key listener for the file items 
	       	           newPiece.addActionListener(this); 
	       	           openPiece.addActionListener(this); 
	       	           delPiece.addActionListener(this); 
	       	           quit.addActionListener(this); 

       	        
       	        
		    	        menu.add (fileMenu);
		    	        this.setJMenuBar(menu);
		    	        

	    	        // frame setup 
	    	        
	    	       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    	        this.setSize(750,600);
	    	        this.setLayout(null); 
	    	        this.setVisible(true);
	    	        this.setResizable(false); 
	    	        Color c1 = new Color(172, 207, 239);
	    	        this.getContentPane().setBackground(c1);
	    	        
	    	        this.add(menu);
    	        
	    	        for(int count = 0; count < 48; count++) {
	    	            
	    	        	this.add(siege[count]); 
	    	        }
    	        
    	                this.add(theatre);
    	            
    	           
    		
    		
    }
    
    
   
    

	@Override
	public void actionPerformed(ActionEvent e) {
		      
		JButton s = (JButton) e.getSource();
		      
		    if( 
		    		s == siege[0]  || s == siege[1]   || s == siege[2]    || s == siege[3]  ||  
		    		s == siege[4]  || s == siege[5]   || s == siege[6]    || s == siege[7]  ||
		    	    s == siege[8]  || s == siege[9]   || s == siege[10]   || s == siege[11] ||
		    	    s == siege[12] || s == siege[13]  || s == siege[14]   || s == siege[15] ||
		    	    s == siege[16] || s == siege[17]  || s == siege[18]   || s == siege[19] ||
		    	    s == siege[20] || s == siege[21]  || s == siege[22]   || s == siege[23] ||
		    	    s == siege[24] || s == siege[25]  || s == siege[27]   || s == siege[28] ||
		    	    s == siege[29] || s == siege[30]  || s == siege[31]   || s == siege[32] ||
		    	    s == siege[33] || s == siege[34]  || s == siege[35]   || s == siege[36] ||
		    	    s == siege[37] || s == siege[38]  || s == siege[39]   || s == siege[40] ||
		    	    s == siege[41] || s == siege[42]  || s == siege[43]   || s == siege[44] ||
		    	    s == siege[45] || s == siege[46]  || s == siege[47] 
		    	    
		    	    		
		    	    ) { 
				               FrameClient client = new FrameClient(); 
				               s.setEnabled(false); 
				               s.setBackground(Color.CYAN);
		                 }
		   
		    /*
		    JMenuItem item = (JMenuItem) e.getSource();
            
		       if(item == newPiece) {
		    	   
		    	   sql.AjouterPiece();
		    	   
		       }else if(item == openPiece) {
		    	   
		    	   sql.ouvrirPiece();

		       }else if(item == delPiece){
		    	   
		           sql.SupprimerPiece

		       }
		         else if(item == quit){
	                
	                System.exit(0);
	                
	                }*/
			
		    
	       }
    }
	
	






	


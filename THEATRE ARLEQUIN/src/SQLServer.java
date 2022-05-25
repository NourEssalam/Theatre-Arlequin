
import java.sql.*;
import javax.swing.*;

 public class SQLServer {
     

   Connection con;
   boolean state;
   
		public SQLServer(String driver, String path, String user, String password) {
			
				 String Msgs="";
				 Statement stmt;
				 System.out.println("-> Chargement du driver...");
				 
		try {
			
				 Class.forName(driver).newInstance();
				 System.out.println("* Driver OK *");
		 }
		
		catch (Exception e) {
			
				JOptionPane.showMessageDialog(null,"ERREUR: Chargement impossible" +
				e,"ERROR",JOptionPane.ERROR_MESSAGE);
		 }
		
		 System.out.println("-> Connexion a la base...");
		 
		try {
			
		 con = DriverManager.getConnection(path, user, password);
		 stmt = con.createStatement();
		
		System.out.println("* Connexion OK *");
		 state=true;
		 stmt.close();
		 
		 }
		catch(SQLException e) {
			
				JOptionPane.showMessageDialog(null,"ERREUR: Connexion impossible.","Erreur",JOptionPane.ERROR_MESSAGE);
				
				while (e != null) {
				 Msgs=e.getMessage();
				 System.out.println("Etat: " + e.getSQLState() + "\n");
				 System.out.println("Code Erreur: " + e.getErrorCode());
				 e = e.getNextException();
				 
				}
				
		JOptionPane.showMessageDialog(null,Msgs,"Erreur",JOptionPane.ERROR_MESSAGE);
		
		            }
		        }
		
		public boolean estconnecter(){
		    boolean connecter = false;
		        if(state==true){
		            connecter = true;
		        }
		    return connecter;
		  
		}
		
		public void close(){
		     try{ con.close();}
		     catch(SQLException e){
		    	 
		         JOptionPane.showMessageDialog(null, "SQL EXEPTION:"+e.getMessage(),"erreur",JOptionPane.ERROR_MESSAGE);         
		     }
		
		}
		
		public void AjouterPiece(String nom, String tele){
			
		try{
			
		    String R = "INSERT INTO CLIENT(nom, tele)VALUES(?,?)";
			PreparedStatement requete = con.prepareStatement(R);
			requete.executeUpdate();
			requete.close();
		}
		
		catch(SQLException E){
			
		    JOptionPane.showMessageDialog(null, "SQL EXEPTION:"+E.getMessage(),"erreur",JOptionPane.ERROR_MESSAGE);         
		    }
		
		 }
		
		public void SupprimerPiece(int id){
			
		try{
			
		    String D = "DELETE FROM CLIENT WHERE ID_RESERVE ="+"";
			PreparedStatement requete = con.prepareStatement(D);
			requete.executeUpdate();
			requete.close();
		 }
		
		catch(SQLException E){
			 
		    JOptionPane.showMessageDialog(null, "SQL EXEPTION:"+E.getMessage(),"erreur",JOptionPane.ERROR_MESSAGE);         
		  }
		
		}
}
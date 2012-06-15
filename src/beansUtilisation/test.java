package beansUtilisation;

import java.util.GregorianCalendar;

import beans.*;

public class test {
	
	public static void main(String args []){
		
		//Lundi
		Enseignant e1=new Enseignant(1,"Aragou", "muriel", "1 avenue du meilleur des tuteurs" , "0143855907",new GregorianCalendar(1960,10, 10), "logAragou", "pwdAragou");	
		Salle s1=new Salle("210A", 50, "enferNum1");
		Formation F1=new Formation();
		UE ue1=new UE(1,F1);
		EC ec1= new EC(1, ue1, F1);
		Type type1 = new Type(1, "TD"); 
		Creneau cLundi = new Creneau(e1, s1, ec1,type1, "09:00", 120);
		Jours j1=new Jours();
		j1.setDate(new GregorianCalendar(2012, 05, 11));
		cLundi.setDate(j1);
		
		//Mardi
		Enseignant e2=new Enseignant(1,"Giroud", "Olivier", "1 avenue des coupeurs d'orange" , "0143855908",new GregorianCalendar(1960,10, 10), "logGiroud", "pwdGiroud");	
		Salle s2=new Salle("210A", 50, "enferNum2");
		Formation F2=new Formation();
		UE ue2=new UE(1,F2);
		EC ec2= new EC(1, ue2, F2);
		Type type2 = new Type(1, "TD"); 
		Creneau cMardi = new Creneau(e2, s2, ec2,type2, "11:00", 120);
		Jours j2=new Jours();
		j2.setDate(new GregorianCalendar(2012, 05, 11));
		cLundi.setDate(j2);	
		
		
		//Jeudi
		Enseignant e4=new Enseignant(1,"Menez", "Jeremy", "1 avenue des croqueurs" , "0143855909",new GregorianCalendar(1960,10, 10), "logMenez", "pwdMenez");	
		Salle s4=new Salle("482A", 50, "enferNum4");
		Formation F4=new Formation();
		UE ue4=new UE(1,F4);
		EC ec4= new EC(1, ue4, F4);
		Type type4 = new Type(1, "TD"); 
		Creneau cJeudi = new Creneau(e4, s4, ec4,type4, "13:00", 120);
		Jours j4=new Jours();
		j4.setDate(new GregorianCalendar(2012, 05, 11));
		cLundi.setDate(j4);
		
		//Vendredi
		Enseignant e5=new Enseignant(1,"Evra", "Patrice", "1 avenue des grevistes" , "0143855910",new GregorianCalendar(1960,10, 10), "logEvra", "pwdEvra");	
		Salle s5=new Salle("210A", 50, "enferNum5");
		Formation F5=new Formation();
		UE ue5=new UE(1,F5);
		EC ec5= new EC(1, ue5, F5);
		Type type5 = new Type(1, "CM"); 
		Creneau cVendredi = new Creneau(e5, s5, ec5,type5, "15:00", 120);
		Jours j5=new Jours();
		j5.setDate(new GregorianCalendar(2012, 05, 11));
		cLundi.setDate(j5);	
		
		
	}

}
package imcArray;

import javax.swing.JOptionPane;

public class Procesos4 {
	
	
	String [] nombre;
	double [] altura;
	int [] peso;
	double [] imc;
	String [] telefono;
	
	public void iniciar() {
				
			pedirDatos();
			clasificacionImc();

	
	}


	private void pedirDatos() {

		nombre = new String[3];
		altura = new double[3];
		peso = new int[3];
		imc = new double[3];
		telefono = new String[3];
		
		double imcUsuario;
		
		for(int i = 0; i < nombre.length; i++) {
			
			nombre[i] = JOptionPane.showInputDialog("ingrese el nombre del usuario");
			altura[i] = Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura de " + nombre[i]));
			peso[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese el peso de " + nombre[i]));
			telefono[i] = JOptionPane.showInputDialog("ingrese el telefono de: " + nombre[i]);
			
			imcUsuario = peso[i]/(altura[i]*altura[i]);
			
			imc[i] = imcUsuario; 
			
			
		}
		
		
	}
	
	private void clasificacionImc() {

		
		for(int i = 0; i < nombre.length; i++) {
			
			if(imc[i] < 18) {
				
				System.out.println(nombre[i] + " ESTADO:  anorexia");
				System.out.println("TELEFONO: " + telefono[i]);
				
			}else if(imc[i] >= 18 && imc[i] < 20) {
				
				System.out.println(nombre[i]  + " ESTADO: Delgadez");
				System.out.println("TELEFONO: " + telefono[i]);
				
			}else if(imc[i] >= 20 && imc[i] < 27) {
				
				System.out.println(nombre[i]  + " ESTADO: Normalidad");
				System.out.println("TELEFONO: " + telefono[i]);
				
			}else if(imc[i] >= 27 && imc[i] < 30) {
				
				System.out.println(nombre[i] + " ESTADO: Obesidad I");
				System.out.println("TELEFONO: " + telefono[i]);
				
			}else if(imc[i] >= 30 && imc[i] < 35) {
				
				System.out.println(nombre[i] + " ESTADO: Obesisdad II");
				System.out.println("TELEFONO: " + telefono[i]);
				
			}else if(imc[i] >= 35 && imc[i] < 40) {
				
				System.out.println(nombre[i]  + " ESTADO: Obesidad III" );
				System.out.println("TELEFONO: " + telefono[i]);
				
			}else if(imc[i] >= 40) {
				
				System.out.println(nombre[i] + " ESTADO: Obesidad Morbida");
				System.out.println("TELEFONO: " + telefono[i]);
				
			}
			
		}
		
	}
	
	
	
	

}

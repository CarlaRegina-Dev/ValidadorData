package DesafioTrêsMain;

import java.util.Scanner;

public class DesafioTrêsMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("digite dia ");
		int dia = entrada.nextInt();
		System.out.println("digite o mes");
		int mes = entrada.nextInt();
		System.out.println("digite o ano");
		int ano = entrada.nextInt();
		
		if(dataValida(dia,mes,ano)==true){
			System.out.println("Data válida");
		}else{
			System.out.println("Data Inválida");
		}
    }
    private static boolean dataValida(int dia, int mes, int ano) {
    	boolean eDataValida = false;
    	
    	switch (mes){
    	case 1: 
    		if(dia>=01 && dia<=31) {
    			return eDataValida = true;
    		}
    	break;  
    	
    	case 2:
    		if(anoBissexto(ano)==true){
    			if(dia>=01&&dia<=29){
    				return eDataValida = true;
        		}       		
        		}else if(dia>=01&&dia<=28) {
        			return eDataValida = true;
    		}		
    	break;
    	
    	case 3: 
    		if(dia>=01&&dia<=31){
    			return eDataValida = true;
    		}
    	break;	
    	
    	case 4:
    		if(dia>=01&&dia<=30){
    			return eDataValida = true;
    		}	
        break;
        
    	case 5: 
    		if(dia>=01&&dia<=31){
    			return eDataValida = true;
    		}	
        break;
        
    	case 6: 
    		if(dia>=01&&dia<=30){
    			return eDataValida = true;
    		}    		
        break;
        
    	case 7: 
    		if(dia>=01&&dia<=31){
    			return eDataValida = true;
    		}
    		
        break;
        
    	case 8: 
    		if(dia>=01&&dia<=31){
    			return eDataValida = true;
    		}
    		
        break;
        
    	case 9:
    		if(dia>=01&&dia<=30){
    			return eDataValida = true;
    		}	
        break;
        
    	case 10: 
    		if(dia>=01&&dia<=31){
    			return eDataValida = true;
    		} 		
        break;
        
    	case 11: 
    		if(dia>=01&&dia<=30){
    			return eDataValida = true;
    		}	
        break;
        
    	case 12: 
    		if(dia>=01&&dia<=31){
    			return eDataValida = true;
    		}    		
        break;
        
    	default: break;	
    	}    	
    	return eDataValida; 
    } 
    private static boolean anoBissexto(int ano) {
    	boolean eAnoBissexto= false;
    	if(ano%400==0 || ano%4==0 && ano%100!=0) {
    		return eAnoBissexto=true;
    	}    	
        return eAnoBissexto;
    }    
}

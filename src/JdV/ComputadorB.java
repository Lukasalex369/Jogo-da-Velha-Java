package JdV;
import java.util.Random;

public class ComputadorB extends Computador{
Random numeroAleatorio = new Random();
	    
	@Override
	public void jogar(String[][] mapa) {
	//nesta dificuldade, está um comando, que foi importado, de jogada aleatoria do computador
	int l,c;
	    while(true){
	    l = numeroAleatorio.nextInt(3);
	    c = numeroAleatorio.nextInt(3);
	    if(mapa[l][c].equals(" ")){
	          mapa[l][c] = "O";
	          return;
	          }
	            
	     }
	 }	

}
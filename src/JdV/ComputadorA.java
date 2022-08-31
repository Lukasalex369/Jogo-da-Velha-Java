package JdV;

public class ComputadorA extends Computador {
	 @Override
    public void jogar(String mapa[][]){
        //marca no primeiro espaço horizontal
        for(int i = 0; i < 3; i++){
            for(int l = 0; l < 3; l++){
                if(mapa[i][l].equals(" ")){
                    mapa[i][l] = "O";
                    return;
                }
            }
        }
    }

    
}

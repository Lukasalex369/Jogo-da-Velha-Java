package JdV;
import java.util.Random;

public class ComputadorC extends Computador{
    Random numeroAleatorio = new Random();
    @Override
        public void jogar(String[][] mapa) {
        //dificuldade em que o computador sempre marcara um lugar proximo de onde voce jogou, se nao tiver essa possibilidade sera uma jogada aleatoria
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(mapa[i][j].equals("X")){
                //aqui a maquina v� se os lados horizontais foram marcados, caso j� tenha sido marcado, ele marcara o oposto
                    try{
                        if(mapa[i+1][j].equals(" ")){
                            mapa[i+1][j] = "O";
                            return;
                        }
                    }catch(Exception e){
                        
                    }
                    try{
                        if(mapa[i-1][j].equals(" ")){
                            mapa[i-1][j] = "O";
                            return;
                        }
                    }catch(Exception e){
                        
                    }
                    
                    //a mesma verifica��o do comando passado, s� que nesse caso � na vertical, caso esteja marcado ele far� o mesmo de antes marcando o oposto
                    try{
                        if(mapa[i][j+1].equals(" ")){
                            mapa[i][j+1] = "O";
                            return;
                        }
                    }catch(Exception e){
                        
                    }
                    try{
                        if(mapa[i][j-1].equals(" ")){
                            mapa[i][j-1] = "O";
                            return;
                        }
                    }catch(Exception e){
                        
                    }
                        
                     
                    
                }
            }
        }
        int l;
        while(true){
            l = numeroAleatorio.nextInt(3);
            for(int l1 = 0; l1 < 3; l1++){
                if(mapa[l][l].equals(" ")){
                    mapa[l][l] = "O";
                    return;
        //se n�o der para a maquina realizar nenhuma das jogadas acima, ser� uma aleatoria
                }
            }
        }
    }

}
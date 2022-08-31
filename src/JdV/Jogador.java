package JdV;

public class Jogador {
    public boolean jogar(String mapa[][], String horizontal, String vertical){
    //coloca um X na posição selecionada caso ela esteja disponivel (X representa o jogador)
        try{
        //transformando os dados que foram inseridos pelo usuário na classe principal (jogodaVelha) para servirem de índices
            int l = Integer.parseInt(horizontal);
            int c = Integer.parseInt(vertical);
            if (mapa[l-1][c-1].equals(" ")){
                mapa[l-1][c-1] = "X";
                return true;
            }else{
             System.out.println("Já escolhida, escolha outra posição");
             return false;
             //Caso seja uma posição ja escolhida, aparecera essa mensagem de erro
            }
        }catch(Exception e){
          System.out.println("O valor não é valido");
          return false;
        }
                    
    }
}
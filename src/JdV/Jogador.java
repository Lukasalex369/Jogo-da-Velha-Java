package JdV;

public class Jogador {
    public boolean jogar(String mapa[][], String horizontal, String vertical){
    //coloca um X na posi��o selecionada caso ela esteja disponivel (X representa o jogador)
        try{
        //transformando os dados que foram inseridos pelo usu�rio na classe principal (jogodaVelha) para servirem de �ndices
            int l = Integer.parseInt(horizontal);
            int c = Integer.parseInt(vertical);
            if (mapa[l-1][c-1].equals(" ")){
                mapa[l-1][c-1] = "X";
                return true;
            }else{
             System.out.println("J� escolhida, escolha outra posi��o");
             return false;
             //Caso seja uma posi��o ja escolhida, aparecera essa mensagem de erro
            }
        }catch(Exception e){
          System.out.println("O valor n�o � valido");
          return false;
        }
                    
    }
}
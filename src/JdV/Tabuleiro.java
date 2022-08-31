package JdV;

public class Tabuleiro {
    //Jogador - X | Computador - O
    public String posicoesTabuleiro[][] = new String[3][3];
    //mapa do tabuleiro
    public int numeroJogadas;
    private String marcaDoVencedor;
    //Marca (X ou O) 
    public Tabuleiro(){
        this.numeroJogadas = 0;
        iniciarPosicoes();
        this.marcaDoVencedor = "";
    }
    
    private void iniciarPosicoes(){
       //inicializa as posicoes
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                this.posicoesTabuleiro[i][j] = " ";
            }
        }
    }
    private void renovarTela(){
        for(int i = 0; i < 30; i++){
            System.out.println();
        }
        System.out.println("\t\tJogo da Velha");
        System.out.println("Você = X | Computador = O\n");
    }
    public void mostrarTabuleiro(){
       renovarTela(); 
       //Tela que da a sensação de atualização
       
       for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(this.posicoesTabuleiro[i][j]);
                if(j<2){
                    System.out.print("|");
        //para ver as marcações do tabuleiro e a jogada 
                }
                
            }
            if(i<2){
                System.out.println("\n-|-|-");
            }
        }
        System.out.println("\n");
    }
    public boolean verificarVitoria(){
        if(numeroJogadas < 5){
            return false;
    //Verificar se tem possibilidade de alguem ganhar por número de jogadas
        }
        if(posicoesTabuleiro[0][0].equals(posicoesTabuleiro[1][1]) && posicoesTabuleiro[1][1].equals(posicoesTabuleiro[2][2]) && !(posicoesTabuleiro[1][1].equals(" "))){
            this.marcaDoVencedor = posicoesTabuleiro[0][0];
            return true;
        }
        if(posicoesTabuleiro[2][0].equals(posicoesTabuleiro[1][1]) && posicoesTabuleiro[1][1].equals(posicoesTabuleiro[0][2]) && !(posicoesTabuleiro[1][1].equals(" "))){
            this.marcaDoVencedor = posicoesTabuleiro[2][0];
            return true;
          //para verificar vitoria diagonal 1 
            
        }
        //loop para ver se tem possibilidades de vitoria nas verticais ou/e nas horizontais
        for(int i = 0; i < 3; i++){
            if(posicoesTabuleiro[i][0].equals(posicoesTabuleiro[i][1]) && posicoesTabuleiro[i][1].equals(posicoesTabuleiro[i][2]) && !(posicoesTabuleiro[i][1].equals(" "))){
                this.marcaDoVencedor = posicoesTabuleiro[i][0];
                return true;
         //para verificar vitoria vertical
            }
            
            if(posicoesTabuleiro[0][i].equals(posicoesTabuleiro[1][i]) && posicoesTabuleiro[1][i].equals(posicoesTabuleiro[2][i]) && !(posicoesTabuleiro[1][i].equals(" "))){
                this.marcaDoVencedor = posicoesTabuleiro[0][i];
                return true;
           //para verificar vitoria horizontal
            }
            
        }
        return false;
    }
    
    public String status(){
        //status da partida 
        boolean statusVitoria = verificarVitoria();
        if(statusVitoria == false && numeroJogadas == 9){
            return "Empatados!!";
        }else if(statusVitoria == false){
            return "Jogo não completo...";
        }else{
        if(this.marcaDoVencedor == "X"){
            return "Você venceu!!";
        }else{
            return "O computador venceu!!";
            }
        }
    }
    
}
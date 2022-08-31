package JdV;
import java.util.Scanner;

public class JogodaVelha {
    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Jogador jogador = new Jogador();
        ComputadorA pc1 = new ComputadorA();
        ComputadorB pc2 = new ComputadorB();
        ComputadorB pc3 = new ComputadorB();
        //Os componentes necess�rios ao game
        
        while(true){
            Tabuleiro tab = new Tabuleiro();
            int nivel = menu();
            boolean vitoriaJogador;
            //menu onde escolhe o n�vel de dificuldade
            
            do{
                if(tab.numeroJogadas == 9){
                    break;
               //para terminar o jogo caso o tabuleiro esteja cheio
                }
                String l,c; 
               //variavel para posi��o de entrada do jogador
                l = c = "";
                tab.mostrarTabuleiro();
                
                do{
                    System.out.print("Posi��o linha: "); l = teclado.next();
                    System.out.print("Posi��o coluna: "); c  = teclado.next();
                }while(!(jogador.jogar(tab.posicoesTabuleiro, l, c)));
                //loop para obrigar o jogador a colocar numeros v�lidos 
                //a letra l foi escolhida para representar a horizontal e c a vertical no c�digo, no caso l de linha e c de coluna
                tab.numeroJogadas++;
                
                vitoriaJogador = tab.verificarVitoria();
                //verifica se houve vencedor na jogada que acaba de acontecer, se sim, ele cancelar� a pr�xima jogada do computador
                if(!(vitoriaJogador)){
                    switch(nivel){
                    case 1:
                        pc1.jogar(tab.posicoesTabuleiro);
                        break;
                    case 2:
                        pc2.jogar(tab.posicoesTabuleiro);
                        break;
                    case 3:
                        pc3.jogar(tab.posicoesTabuleiro);
                        break;
                        //aqui ele puxa o tipo de jogada baseado no nivel de dificuldade escolhido
                    }
                    tab.numeroJogadas++;
                }
                
                
            }while(!(tab.verificarVitoria()));
            //vendo se teve um vencedor na rodada
            
            tab.mostrarTabuleiro();
            System.out.println(tab.status());
            System.out.println("Aperte qualquer tecla para iniciar uma nova partida");
            teclado.next();
            //final do jogo, dando op��o de jogar novamente
            
        }
   }
    
    public static int menu(){
        //este menu � resposavel pela escolha do nivel
        Scanner teclado = new Scanner(System.in);
        int nivel = 0;
        
        while(true){
            try{
                System.out.print("\nEscolha o n�vel (1 - (f�cil, 2 - (intermediario) ou 3 - (dificil)): ");
                nivel = Integer.parseInt(teclado.next());
                switch(nivel){
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                    case 3:
                        return 3;
                    default:
                        System.out.println("O N�vel selecionado � inv�lido");
               //loop que s� termina selecionando um dos 3 n�veis dispon�veis e se colocar um n�mero invalido ele d� erro
                }
                
            }catch(Exception e){
                    System.out.println("Dados inv�lidos");
            }
        }
    }
    
    
}

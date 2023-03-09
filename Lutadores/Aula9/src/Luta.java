
import java.util.Random;


public class Luta implements LutaInterface {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    
    
    public Luta(int rounds) {
        this.rounds = rounds;
        this.aprovado = false;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    

    @Override
    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if (desafiante.getCategoria()==desafiado.getCategoria()&&desafiado!=desafiante){
            this.aprovado=true;
            this.desafiante = desafiante;
            this.desafiado = desafiado;
            System.out.println("A luta entre "+desafiado.getNome()+" e "+desafiante.getNome()+" marcada!");
        }else{
            this.aprovado = false;
            this.desafiante = null;
            this.desafiado = null;
            System.out.println("A luta não poderá acontecer!");
    }
    }
    @Override
    public void lutar(){
        if (this.aprovado=true){
            
            Random aleatorio = new Random ();
            int vencedor = aleatorio.nextInt(3);
            
            switch (vencedor){
                case 0:
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    System.out.println("--Empate!--");
                    break;
                case 1:
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    System.out.println("--"+this.desafiado.getNome()+" ganhou!--");
                    break;
                case 2:
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    System.out.println("--"+this.desafiante.getNome()+" ganhou!--");
                    break;
        }
        }else{
            System.out.println("A luta não foi aprovado!");
        }
    }

   
    
}

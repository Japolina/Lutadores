
public class Aula9 {
    public static void main(String[] args) {
        Lutador[] lutador = new Lutador [2];
        
        lutador[0] = new Lutador("Matheus", "Alemão", 20, 10, 2 , 2, 1.79f, 89);
        lutador[1] = new Lutador("João", "Brasileiro", 22, 6, 3 ,4, 1.83f, 110);
        Luta luta1 = new Luta(3);
        
        System.out.println("-------- ♦ Lutador ♦ -------");
        lutador[0].ganharLuta();
        lutador[0].perderLuta();
        lutador[0].empatarLuta();
        lutador[0].status();
        System.out.println("------- ♦ Lutador 2 ♦ -------");
        lutador[1].status();
        
        System.out.println("\n----- ♦ Luta ♦ ------");
        luta1.marcarLuta(lutador[0], lutador[1]);
        luta1.lutar();
        System.out.println("\n----- ♦ Resultado Final ♦ -----");
        lutador[0].status();
        System.out.println("------- ♦ Lutador 2 ♦ -------");
        lutador[1].status();
        System.out.println("\n");
    }
    
}


public class Lutador implements LutadorInterface {
    private String nome;
    private String nacionalidade;
    private String categoria;
    private int idade;
    private int vitorias;
    private int derrotas;
    private int empates;
    private float altura;
    private float peso;

    public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, float altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        String categoria;
        if (this.getPeso()<52.2){
            categoria = "Inválido";
        }else if(this.getPeso()<=73.3){
            categoria = "Leve";
        }else if (this.getPeso()<=83.9){
            categoria = "Médio";
        }else if (this.getPeso()<=120.2){
            categoria = "Pesado";
        }else {
            categoria = "Inválido";
        }
        this.categoria = categoria;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    @Override
    public void status() {
        
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Altura: "+this.getAltura());
        System.out.println("Peso: "+this.getPeso()+" kg");
        System.out.println("Categoria: "+this.getCategoria());
        System.out.println("Vitorias: "+this.getVitorias());
        System.out.println("Derrotas: "+this.getDerrotas());
        System.out.println("Empates: "+this.getEmpates());
    }

    @Override
    public void ganharLuta() {
            this.setVitorias(this.getVitorias() + 1);
            
    }
    
    @Override
    public void perderLuta() {
            this.setDerrotas(this.getDerrotas() + 1);
        }
    

    @Override
    public void empatarLuta() {
            this.setEmpates(this.getEmpates() + 1);
    }
    
    
    
}

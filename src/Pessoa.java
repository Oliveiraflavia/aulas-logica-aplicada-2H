public class Pessoa extends Animal{

    // Atributos da Classe
    public String sobrenome;

    // métodos da Classe
    public void falar(){
        System.out.println("falei");
    }
    public String falar(String texto){
        return texto;
    }

    public Pessoa criarPessoa() { return new Pessoa();
    }
    //Sobrscrito do método
    public void comer(){
        System.out.println("pessoa comeu");
    }
}
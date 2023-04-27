public class InstrumentosCorda extends Instrumento{
    public InstrumentosCorda(String nome, String material, int quantidade){
        super(nome, material, quantidade);
    }
    public void TrocarCorda(){
        System.out.println("Este intrumento troca corda");
    }

    @Override
    public void Afinar(){
        System.out.println("Este instrumento afina");
    }

}

public class Reptil extends Animal{
    private String corDaEscama;

    @Override
    public void locomover(){
        System.out.println("Andando, correndo, rastejando");
    }

    @Override
    public void alimentar(){
        System.out.println("Alimentando-se de: Ovos, insetos, peixes, algas");
    }

    @Override
    public void emitirSom(){
        System.out.println("Rugir, esturra, chocalhar, bramir");
    }

    public String getCordDaEscama(){
        return this.corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama){
        this.corDaEscama = corDaEscama;
    }

}

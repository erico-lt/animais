public class Peixe extends Animal {
    private String corDaEscama;

    public void soltarBolhar(){
        System.out.println("Soltando bolhas");
    }

    @Override
    public void locomover(){
        System.out.println("Locomoção: nadando, rasteijando");
    }

    @Override
    public void alimentar(){
        System.out.println("Alimentação: algas, peixes, frutos do mar");
    }

    @Override
    public void emitirSom(){
        System.out.println("Sons: bufar");
    } 
  
    public String getCorDaEscama() {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }

}

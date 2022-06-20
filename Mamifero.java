public class Mamifero extends Animal{
    private String corDoPelo;

    @Override
    public void locomover(){
        System.out.println("Andando, nadando");
    }
    @Override
    public void alimentar(){
        System.out.println("Carne, frutas e tudo que há de bom");
    }

    @Override
    public void emitirSom(){
        System.out.println("Late, rosna, grita");
    }

    public String getCordDoPelo(){
        return this.corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo){
        this.corDoPelo = corDoPelo;
    }

}

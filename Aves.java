public class Aves  extends Animal{
    private String corDaPena;

    public void fazerNinho(){
        System.out.println("Colher madeira, fazendo ninho");
    }

    @Override
    public void locomover(){
        System.out.println("Locomoção: Voando, andando, nadando");
    }

    @Override
    public void alimentar(){
        System.out.println("Alimentos: Anelidios, grãos, peixes, roedores, repiteis");
    }

    @Override
    public void emitirSom(){
        System.out.println("Sons: Grasnar, piar, canta, grasnar, cacareja");
    } 

    public String getCorDaPena() {
        return corDaPena;
    }
    
    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }

}

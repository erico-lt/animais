public class Cachorro extends Lobo{
    
    @Override 
    public void emitirSom(){
        System.out.println("Som: Au! Au! Au! Auuuuuuu!");
    }

    public void reagir(String frase){
        if(frase == "Ola" || frase == "Bonitinho"){
            System.out.println("Abanar");
            System.out.println("Latir");
        }else{
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Abanar");
        }else if(hora > 16){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar");
            System.out.println("Latir");            
        }
    }

    public void reagir(boolean dono){
        if(dono == true){
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar");
            System.out.println("Latir");
        }
    }

    public void reagir(int idade, float peso){
        if(idade <= 5){

            if(peso <= 10.5){
                System.out.println("Abanar");                
            }else{
                System.out.println("Latir");
            }

        }else{
            if(peso <= 10.5){
                System.out.println("Rosna");
            }else{
                System.out.println("Ignora");
            }
        }
    }
}

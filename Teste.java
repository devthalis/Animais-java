
package Animais;

public class Teste {
    
    public static void main(String [] args) {
        
        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        camelo.setNumPatas(4);
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);
        
        Peixe tubarao = new Peixe();
        
        tubarao.setComprimento(300);
        tubarao.setNome("Tubarao");
        tubarao.setVelocidade(15);

        Mamifero urso = new Mamifero();

        urso.setNome("Urso do Canada");
        urso.setComprimento(180);
        urso.setCor("vermelho");
        urso.setVelocidade(5);
        
        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;

        for(Animal animaisTodos : animais){
            System.out.println("------------------------");
            System.out.println(animaisTodos.toString());
            
        }
    }
}

package aula02;
class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Est� tampada? " + this.tampada);
    }
    
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("N�o posso rabiscar, pois a caneta est� tampada!");
        }
        else {
            System.out.println("Estou rabiscando! A caneta est� destampada.");
        }
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
    
    
    
}
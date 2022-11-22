package aula02;
class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Est� tampada? " + this.tampada);
    }
    
    protected void rabiscar() {
        if (this.tampada == true) {
            System.out.println("N�o posso rabiscar, pois a caneta est� tampada!");
        }
        else {
            System.out.println("Estou rabiscando! A caneta est� destampada.");
        }
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
    
    
    
}
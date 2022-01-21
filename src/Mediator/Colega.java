package Mediator;

abstract public class  Colega {
    public Mediator mediator;

    public Colega() {
        System.out.println("Estoy en contructor de clase padre");
    }
    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    abstract void recibe();
    abstract void envia();

}

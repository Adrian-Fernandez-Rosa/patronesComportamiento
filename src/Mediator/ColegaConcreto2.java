package Mediator;

public class ColegaConcreto2 extends Colega{




    public ColegaConcreto2(){
        System.out.println("Soy constructor en colegaConcreto2");
    }


    @Override
    void recibe() {
        System.out.println("He recibido un mensaje, soy ColegaConcreto 2");
    }

    @Override
    void envia() {
        System.out.println("Soy ColegaConcreto 2, envió un mensaje");
        mediator.reenvia(this);

    }
}

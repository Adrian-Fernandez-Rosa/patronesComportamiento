package Mediator;

import java.util.ArrayList;

public class MediadorConcreto extends Mediator{
    ArrayList<Colega> colegas = new ArrayList();

    @Override
    void registra(Colega colega) {
      //  colegas.add(colega); //no es correcto a nivel logico

        if (!colegas.contains(colega)){
            colegas.add(colega);

            //digo quien sera su mediador
            colega.setMediator(this); //mediadorCroncreto sera mediador
        }
    }

    @Override
    void reenvia(Colega colega) {
        for (Colega actual : colegas){
            if (!actual.equals(colega)){
                actual.recibe();
            }

        }
    }
}

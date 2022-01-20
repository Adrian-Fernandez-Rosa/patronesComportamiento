package Iterator;

public interface UsuarioIterator {

    //metodos comunes para patrón iterator
/*
    next();//devolver el siguiente elemento en una lista o hashmap o lo que sea
    reset(); //reinicia el contador a 0 (indice al principio de la lista)
    hasMore(); //si hay mas elementos para recorrer


 */
    // Hay mas usuarios en el iterador??
    boolean hayMas();

    // Reinicia el contador
    void reinicia();

    // Obtiene el siguiente
    Usuario siguiente();


}

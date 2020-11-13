/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 * @param <E>
 */
public abstract class ControladorAbstracto<E> {

    private List<E> lista;

    public ControladorAbstracto() {
        lista = new ArrayList();
    }

    public List<E> getLista() {
        return lista;
    }

    public void setLista(List<E> lista) {
        this.lista = lista;
    }

    public boolean create(E objeto) {
        return lista.add(objeto);
    }
    public E read(E objetoBuscar) {
        if (lista.contains(objetoBuscar)) {
            return (E) lista.stream().filter(objeto -> objeto.equals(objetoBuscar)).findFirst().get();
        } else {
            return null;
        }

    }
    public E buscar(E comparacion) {
        return lista.stream().filter(objeto -> objeto.equals(comparacion)).findFirst().get();
    }

    public boolean delete(E objeto) {

        return lista.remove(objeto);
    }

    public int BuscarPocicion(E compararar) {

        for (int i = 0; i < lista.size(); i++) {
            E objeto = lista.get(i);

            if (objeto.equals(compararar)) {
                return i;
            }

        }
        return -1;
    }

    public boolean updtade(E objeto) {
        int index = BuscarPocicion(objeto);
        System.out.println(index);
        if (index >= 0) {
            lista.set(index, objeto);

        }

        return (index >= 0);
    }
        public List<E> findAll() {
        return lista;
    }
        public void imprimirListaReflexion(List lista){
        for (Object object : lista) {
            Method[] metodos = object.getClass().getMethods();
            for(Method m: metodos){
                
                if(m.getName().substring(0,3).equals("get")){
                    try {
                       Object variable = (Object) m.invoke(object, null);
                       System.out.print(variable+"  ");
                    } catch (IllegalAccessException ex) {
                      
                    } catch (IllegalArgumentException ex) {
                      
                    } catch (InvocationTargetException ex) {
                       
                    }
                }
            }
            System.out.println("");
        }
    }
 public abstract boolean validar(E objeto);
    
    public abstract void ordenarLista();
    
    public abstract int generarId();
    
 
}

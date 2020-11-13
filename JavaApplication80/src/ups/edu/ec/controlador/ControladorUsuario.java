/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.List;
import ups.edu.ec.modelo.Telefono;
import ups.edu.ec.modelo.Usuario;

/**
 *
 * @author user
 */
public class ControladorUsuario extends ControladorAbstracto<Usuario> {

    public Usuario iniciarSesion(String correo, String contraseña) {
        for (Usuario usuario : (List<Usuario>) findAll()) {
            if (usuario.getCorreo().equals(correo) && usuario.getContraseña().equals(contraseña)) {
                return usuario;

            }

        }
        return null;
    }

    public Usuario buscarUsuario(int id) {
        List<Usuario> p = getLista();

        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).getId() == id) {
                return p.get(i);
            }
        }
        return null;

    }
    @Override
     public int generarId(){
        List<Usuario> lista = getLista();
        int codigo = 0;
        if (lista.size()>0){
            for (Usuario persona : lista) {
                int aux = persona.getId();
                if(aux>codigo){
                    codigo=aux;
                }
            }
            return codigo+1;
        }else{
            return 1;
            
        }
    }
    public Usuario buscarUsuariosPorCedula(int id) {
        List<Usuario> p = getLista();

        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).getId() == id) {
                return p.get(i);
            }
        }
        return null;

    }
    @Override
    public boolean validar(Usuario objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ordenarLista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}

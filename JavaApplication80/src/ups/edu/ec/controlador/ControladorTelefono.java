/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.ArrayList;
import java.util.List;
import ups.edu.ec.modelo.Telefono;
import ups.edu.ec.modelo.Usuario;

/**
 *
 * @author user
 */
public class ControladorTelefono extends ControladorAbstracto<Telefono> {

    public List<Telefono> ListarPorUsuario(int idUsuario) {
        List<Telefono> telf = getLista();
        List<Telefono> resp = new ArrayList();
        for (int i = 0; i < telf.size(); i++) {
            if (telf.get(i).getPropietario().getId() == idUsuario) {
                resp.add(telf.get(i));
            }
        }
        return resp;
    }

    public Usuario BuscarDueno(int idtelf) {
        List<Telefono> telf = getLista();
        for (int i = 0; i < telf.size(); i++) {
            if (telf.get(i).getPropietario().getId() == idtelf) {
                return telf.get(i).getPropietario();
            }
        }
        return null;
    }

    public Telefono BuscarTelefonoPorId(int idtelf) {
        List<Telefono> telf = getLista();
        for (int i = 0; i < telf.size(); i++) {
            if (telf.get(i).getId() == idtelf) {
                return telf.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean validar(Telefono objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ordenarLista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int generarId() {
      
        List<Telefono> lista = getLista();
        int codigo = 0;
        if (lista.size()>0){
            for (Telefono telefono : lista) {
                int aux = telefono.getId();
                if(aux>codigo){
                    codigo=aux;
                }
            }
            return codigo+1;
        }else{
            return 1;
            
        }
    }
}

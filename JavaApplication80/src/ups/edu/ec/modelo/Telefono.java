/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.modelo;

import java.util.Objects;

/**
 *
 * @author user
 */
public class Telefono {
     private int id;
    private String numero;
    private String tipo;
    private String operadora;
    private Usuario propietario;

    public Telefono() {
    }

    public Telefono(int id, String numero, String tipo, String operadora) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.operadora = operadora;
    }

    public Telefono(int id, String numero, String tipo, String operadora, Usuario propietario) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.operadora = operadora;
        this.propietario = propietario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public Usuario getPropietario() {
        return propietario;
    }

    public void setPropietario(Usuario propietario) {
        this.propietario = propietario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.numero);
        hash = 29 * hash + Objects.hashCode(this.tipo);
        hash = 29 * hash + Objects.hashCode(this.operadora);
        hash = 29 * hash + Objects.hashCode(this.propietario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Telefono other = (Telefono) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.operadora, other.operadora)) {
            return false;
        }
        if (!Objects.equals(this.propietario, other.propietario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Telefono{" + "id=" + id + ", numero=" + numero + ", tipo=" + tipo + ", operadora=" + operadora + ", propietario=" + propietario + '}';
    }
    
}

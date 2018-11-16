
package lab5_stephanie_martinez;

import java.util.Date;


public class Empleado {
    String nombre;
    Date fecha;
    String correo;
    String cargo;
    int salario;

    public Empleado() {
    }

    public Empleado(String nombre, Date fecha, String correo, String cargo, int salario) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.correo = correo;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", fecha=" + fecha + ", correo=" + correo + ", cargo=" + cargo + ", salario=" + salario + '}';
    }
    
}

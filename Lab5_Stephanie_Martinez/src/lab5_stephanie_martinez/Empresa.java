package lab5_stephanie_martinez;

import java.util.Date;

public class Empresa {

    String nombre;
    double capital;
    Date fecha;
    String ubicacion;
    int id;
    String pin;

    public Empresa() {
    }

    public Empresa(String nombre, double capital, Date fecha, String ubicacion, int id, String pin) {
        this.nombre = nombre;
        this.capital = capital;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.id = id;
        this.pin = pin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", capital=" + capital + ", fecha=" + fecha + ", ubicacion=" + ubicacion + ", id=" + id + ", pin= " + pin + '}';
    }

}

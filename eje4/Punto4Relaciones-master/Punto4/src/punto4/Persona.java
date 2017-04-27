/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

/**
 *
 * @author usuario
 */
class Persona {
    private Fecha fechaNacimiento;

    public Persona() {
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona: " + " fecha de nacimiento" + fechaNacimiento + '.';
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procesos;

/**
 *
 * @author ALIS
 */
public class Procesos {
    public boolean Validacion(String usuario, String contraseña) {

        boolean comprovacion = false;

        if ("Alicia".equals(usuario) && "Alicia1999".equals(contraseña)) {
            comprovacion = true;
        }

        return comprovacion;
    }
}


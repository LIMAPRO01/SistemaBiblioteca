/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrousuario;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class RegistroUsuario {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("=== Registro de Usuario ===");
        System.out.print("Nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        System.out.print("Correo electrónico: ");
        String correo = scanner.nextLine();

        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();

        // Crear objeto de usuario
        Usuario nuevoUsuario = new Usuario(nombreUsuario, correo, contrasena);

        // Confirmar registro
        System.out.println("\n¡Usuario registrado con éxito!");
        System.out.println("Bienvenido, " + nuevoUsuario.getNombreUsuario());
    }
}

// Clase Usuario simple
class Usuario {
    private String nombreUsuario;
    private String correo;
    private String contrasena;

    public Usuario(String nombreUsuario, String correo, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
}

  


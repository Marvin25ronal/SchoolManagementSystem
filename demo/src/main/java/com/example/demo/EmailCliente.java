package com.example.demo;

public class EmailCliente {
    public void enviarCorreo(String direccion, String mensaje) {
        // Lógica para enviar un correo
        if(direccion.isEmpty() || mensaje == null) {
            return;
        }
        System.out.println("Enviando correo a " + direccion + " con el mensaje: " + mensaje);
    }
}

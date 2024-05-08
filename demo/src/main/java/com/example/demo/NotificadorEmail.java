package com.example.demo;

public class NotificadorEmail {
    private EmailCliente emailCliente;

    public NotificadorEmail(EmailCliente emailCliente) {
        this.emailCliente = emailCliente;
    }

    public void notificar(String direccion, String mensaje) {
        // Lógica para enviar una notificación por correo
        if(direccion.isEmpty() || mensaje == null) {
            return;
        }
        emailCliente.enviarCorreo(direccion, mensaje);
    }
}

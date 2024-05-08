package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class NotificadorEmailTest {
    @Mock
    private EmailCliente emailClienteMock;


    @Test
    public void testNotificar() {
        NotificadorEmail notificador = new NotificadorEmail(emailClienteMock);
        notificador.notificar("ejemplo@test.com", "Hola Mundo");

        // Verificar que emailClienteMock.enviarCorreo se llamó con los argumentos correctos
        Mockito.verify(emailClienteMock).enviarCorreo("ejemplo@test.com", "Hola Mundo");
    }
    @Test
    public void testNotificarConDireccionVacia() {
        NotificadorEmail notificador = new NotificadorEmail(emailClienteMock);
        notificador.notificar("", "Mensaje");

        // Verificar que no se realiza el envío si la dirección es vacía
        Mockito.verify(emailClienteMock, Mockito.times(0)).enviarCorreo(ArgumentMatchers.anyString(), ArgumentMatchers.anyString());
    }

    @Test
    public void testNotificarConMensajeNulo() {
        NotificadorEmail notificador = new NotificadorEmail(emailClienteMock);
        notificador.notificar("ejemplo@test.com", null);

        // TODO: Implementa la lógica de verificación según tu lógica de negocio

        // Verificar que no se realiza el envío si el mensaje es nulo
        Mockito.verify(emailClienteMock, Mockito.times(0)).enviarCorreo(ArgumentMatchers.anyString(), ArgumentMatchers.anyString());

    }


}

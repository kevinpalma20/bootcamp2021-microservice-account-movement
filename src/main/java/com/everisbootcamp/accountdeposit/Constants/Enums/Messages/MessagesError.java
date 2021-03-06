package com.everisbootcamp.accountdeposit.Constants.Enums.Messages;

import lombok.Getter;

@Getter
public enum MessagesError {
    INCORRECT_DATA(400, "Datos incorrectos."),
    REPETED_DATA(400, "Datos repetidos."),
    NOTFOUND_DATA(404, "Datos no encontrados."),
    MOVEMENT_DENIED(400, "Movimiento denegado."),
    CLIENT_ACCOUNT_DENIED(400, "Usted ya no puede adquirir mas cuentas de este tipo."),
    AMOUNT_INSUFFICIENT(400, "Monto insuficiente.");

    private Integer cod;
    private String messages;

    private MessagesError(Integer cod, String messages) {
        this.cod = cod;
        this.messages = messages;
    }
}

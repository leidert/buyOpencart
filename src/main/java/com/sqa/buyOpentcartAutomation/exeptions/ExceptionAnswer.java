package com.sqa.buyOpentcartAutomation.exeptions;

public class ExceptionAnswer extends AssertionError {
    public static final String ORDER_ERROR = "NO SE GENERO LA ORDEN DE COMPRA";
    public static final String SEARCH_ERROR = "EL PRODUCTO EXISTE";

    public ExceptionAnswer(String message, Throwable cause) {
        super(message, cause);
    }
}

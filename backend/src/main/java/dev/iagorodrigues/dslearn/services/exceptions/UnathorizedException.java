package dev.iagorodrigues.dslearn.services.exceptions;

public class UnathorizedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UnathorizedException(String message) {
        super(message);
    }
}

package org.jenkins.plugins.lockableresources;

public class NoReleaseLockException extends Exception {
    public NoReleaseLockException(String errorMessage) {
        super(errorMessage);
    }
}

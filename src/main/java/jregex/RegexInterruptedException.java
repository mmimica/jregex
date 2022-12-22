package jregex;

/**
 * Thrown in case regex execution is interrupted by {@link Thread#interrupt()}.
 */
public class RegexInterruptedException extends InterruptedException {
    public RegexInterruptedException() {
    }

    public RegexInterruptedException(String regex) {
        super(regex);
    }
}

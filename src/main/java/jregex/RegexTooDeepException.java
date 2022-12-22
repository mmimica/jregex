package jregex;

/**
 * Throw in case regex execution breached {@link Matcher#REGEX_NLOOKAHEAD_LIMIT} or {@link Matcher#REGEX_DEPTH_LIMIT}.
 */
public class RegexTooDeepException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public RegexTooDeepException() {
    }

    public RegexTooDeepException(String regex) {
        super(regex);
    }
}

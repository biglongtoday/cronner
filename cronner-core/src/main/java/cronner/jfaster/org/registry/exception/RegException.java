package cronner.jfaster.org.registry.exception;

/**
 * 注册中心异常.
 *
 * @author fangyanpeng
 *
 * */
public final class RegException extends RuntimeException {
    
    private static final long serialVersionUID = -6417179023552012152L;
    
    public RegException(final String errorMessage, final Object... args) {
        super(String.format(errorMessage, args));
    }
    
    public RegException(final Exception cause) {
        super(cause);
    }
}
package ExceptionTreatment.Model;

public class AppExceptions extends Exception {
    private static final long serialVersionUID = 1L;

    public AppExceptions(String msg) {
        super(msg);
    }
}

package execptions;

public class ResourseNotFoundExeception extends Exception {
    public ResourseNotFoundExeception(String resourse, String error, String field) {
        super(String.format("%s not found with %s : %s",resourse,field,error));
    }
}

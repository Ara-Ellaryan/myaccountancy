package am.ara.mynotebook.util;

public class EmptyValidator {

    public static boolean NullOrBlank(String str){
        return str == null || str.trim().isBlank();
    }
}

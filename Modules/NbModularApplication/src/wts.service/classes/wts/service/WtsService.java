package wts.service;

/**
 *
 * @author ayrat
 */
public class WtsService {

    private final String msg;

    public WtsService(String msg) {
        this.msg = msg;
    }
    
    
    
    public String getMessage(){
        
        return msg;
    }
}

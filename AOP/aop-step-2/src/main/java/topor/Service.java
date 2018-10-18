package topor;
public class Service {
    
    public void showMessage(String msg){
        System.out.println(msg);
    }
    
    public static void main(String[] args) {
        new Service().showMessage("one two three fout");
    }
}
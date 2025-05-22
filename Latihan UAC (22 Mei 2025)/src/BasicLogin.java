

public class BasicLogin implements ILogin {
    public String username;
    public String password;
    
    @Override
    public boolean  authenticate(String username, String password) {
        if(this.username == username && this.password == password){
            return true;
        } else {
            return false;
        }
    }
    
    public BasicLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

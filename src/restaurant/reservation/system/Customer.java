package restaurant.reservation.system;

public class Customer extends User{

    public Customer() {
    }

    @Override
    public void setName(String name) {
        super.setName(name); 
    }

    @Override
    public String getName() {
        return super.getName(); 
    }
    
     @Override
    public void setRole(String role) {
        super.setRole(role); 
    }

    @Override
    public String getRole() {
        return super.getRole(); 
    }
    
     @Override
    public void setUsername(String username) {
        super.setUsername(username);
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    
    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }
}

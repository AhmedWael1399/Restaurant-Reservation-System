package restaurant.reservation.system;

public class Waiter extends User {

    @Override
    public void setPassword(String password) {
        super.setPassword(password); 
    }

    @Override
    public String getPassword() {
        return super.getPassword(); 
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
    public void setRole(String role) {
        super.setRole(role); 
    }

    @Override
    public String getRole() {
        return super.getRole(); 
    }

    @Override
    public void setName(String name) {
        super.setName(name); 
    }

    @Override
    public String getName() {
        return super.getName(); 
    }
}

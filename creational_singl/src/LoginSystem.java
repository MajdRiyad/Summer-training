public class LoginSystem {

    private static LoginSystem instance ;
    private User [] users ;
    private User loggedUser ;

    private LoginSystem() {
        users = new User[]{
                new Students("Majd", "1202923",1202923,"majd"),
                new Students("leen","1234",1234,"leen"),
                new Teacher("Riyad",122,"Riyad","122")
        };
    }
    public static LoginSystem getInstance(){
        if(instance == null){
            instance = new LoginSystem();
        }
        return instance;
    }
    public boolean login(String username, String password){
        for(User u : users){
            if(u.checkUser(username, password)){
                loggedUser = u;
                return true;
            }
        }
        return false;
    }
    public void logout(){
        loggedUser = null;
    }
    public User getLoggedUser(){
        if(loggedUser instanceof  Students){
            return loggedUser;
        }
            return loggedUser;
    }
}

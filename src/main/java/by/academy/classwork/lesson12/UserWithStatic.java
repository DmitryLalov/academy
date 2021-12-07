package by.academy.classwork.lesson12;

public class UserWithStatic {
    private String login = "qwerty";
    private String password = "1234";

    protected String getLogin(){
        return login;
    }

    protected String getPassword() {
        return password;
    }

    public static class Query{
        UserWithStatic user;
        public Query(UserWithStatic user){
            this.user = user;
        }
        public Query() {
        }
        public void printToLog(){
            System.out.println("login: "+user.login+"\t password: "+user.password);
        }
    }
    protected void createQuery(){
        Query q = new Query();
        q.printToLog();
    }
}

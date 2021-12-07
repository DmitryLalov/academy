package by.academy.classwork.lesson12;

public class User {
    private String login = "qwerty";
    private String password = "1234";
    protected void createQuery(){
        Query query = new Query();
        query.printToLog();
    }
    public class Query{
        public void printToLog(){
            System.out.println("login: "+login+"\t password: "+password);
        }
    }
}

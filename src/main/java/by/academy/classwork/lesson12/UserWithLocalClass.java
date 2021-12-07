package by.academy.classwork.lesson12;

public class UserWithLocalClass {
    private String login = "qwerty";
    private String password = "1234";

    protected void createQuery(){
        class Query{
            public void printToLog(){
                System.out.println("login: "+login+"\t password: "+password);
            }
        }
        Query query = new Query();
        query.printToLog();
    }

}

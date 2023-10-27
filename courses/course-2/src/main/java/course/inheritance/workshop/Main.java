package course.inheritance.workshop;

public class Main {
    public static void main(String[] args) {

        DbManager dbManager = new MongoDbManager();
        dbManager.add(1);
        dbManager.update(2);
    }
}

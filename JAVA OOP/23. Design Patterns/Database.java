public class Database {

    private String type;
    private static Database instance = null;

    private Database() {

    }

    private Database(String type) {
        this.type = type;
    }

    public static Database getInstance(String type) {

      
        if (instance != null) {
            return instance;
        }
       
        Database database = new Database(type);
        instance = database;
        return database;
    }
}

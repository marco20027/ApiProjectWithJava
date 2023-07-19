import java.util.HashMap;
import java.util.Map;

public class DataStore {
    private Map<String, Person> personMap = new HashMap<>();

    private static DataStore instance = new DataStore();
    public static DataStore getInstance(){
        return  instance;
    }

    private  DataStore(){
        personMap.put("Marco", new Person ("Marco", "primo programma",2002));
    }
    public Person getPerson(String name ){
        return personMap.get(name);
    }
    public void putPerson(Person person){
        personMap.put(person.getName(), person);
    }
}

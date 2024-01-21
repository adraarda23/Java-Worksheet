package Day17;

public class Singleton {
	private static Singleton instance;
    private String data;
    private static int createCounter=0;

    private Singleton() {
        data = "Bu, singleton örneğinin verisi.";
    }

    public static Singleton getInstance() {
    	createCounter++;
        if (instance == null) {
            instance = new Singleton(); //***only creates one instance ***
        }
        return instance;
    }

    public String getData() {
        return data;
    }

    public void setData(String newData) {
        this.data = newData;
    }
    public int getCreateCounter() {
    	return createCounter;
    }
}


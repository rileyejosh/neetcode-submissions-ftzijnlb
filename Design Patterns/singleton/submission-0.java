static class Singleton {

    static Singleton s = null;
    String value = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if(s == null) {
            s = new Singleton();
        } 
        return s;

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}

package Practice;
public class SingleTon {
    int id = 1;
    static SingleTon instance = null;
    private SingleTon(){}
    public static SingleTon getInstance(){
        if(instance == null)
            instance =  new SingleTon();
        return instance;
    }
    public static void main(String[] args) {
        SingleTon s = SingleTon.getInstance();
        SingleTon v = SingleTon.getInstance();
        s.id=25;
        System.out.println(v.id);
    }
}

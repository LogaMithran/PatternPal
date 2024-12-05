package creational.singleton;

public class SingletonClient {

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance("Foo");
        System.out.println(s.value);

        Singleton s1 = Singleton.getInstance("FooBar");
        System.out.println(s1.value);
    }
}

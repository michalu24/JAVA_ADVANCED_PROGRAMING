package Testy;

public class Y extends X{
    public Y() {
        System.out.println("Y:C");
    }

    public Y(String s) {
        super(s);
        System.out.println("Y:Z");;
    }
}

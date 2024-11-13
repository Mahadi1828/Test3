package mypackage;

abstract class Bike {

    Bike() {
        System.out.println("bike is created");
    }

    abstract void run();

    void changeGare() {
        System.out.println("gear change");
    }

}

class Honda extends Bike {

    @Override
    void run() {
        System.out.println("running safely");
    }

}

public class Tesat {

    public static void main(String[] args) {
        Bike m;
        m = new Honda();
        m.changeGare();
        m.run();
    }
}

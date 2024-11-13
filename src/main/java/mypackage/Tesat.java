

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

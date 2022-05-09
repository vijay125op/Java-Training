class sequence {
    static int counter;
    static sequence obj = null;

    private sequence() {
        counter = 0;

    }

    static synchronized sequence getInstance() {
        if (obj == null) {
            obj = new sequence();
        }
        return obj;

    }

    static synchronized int getCount() {
        counter++;
        return counter;
    }
}

public class DemoSingleTon {
    public static void main(String[] args) {
        sequence s = sequence.getInstance();
    }
}
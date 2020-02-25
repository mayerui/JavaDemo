public class FinalizeDemo {
    public static void main(String[] args) {
        gc();
        nogc();
        return;
    }

    public FinalizeDemo(String s) {
        this.text = s;
    }

    public static void gc() {
        new FinalizeDemo("gc");
        System.gc();
    }
    
    public static void nogc() {
        new FinalizeDemo("nogc");
        // System.gc();
    }

    protected void finalize() {
        System.out.println("fuck you finalize " + text);
    }

    private String text;
}
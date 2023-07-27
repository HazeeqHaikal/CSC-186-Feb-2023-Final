class ABC {
    protected int i;

    public ABC(int j) {
        this.i = j;
    }

    public int subtraction() {
        return i - 5;
    }
}

class XYZ extends ABC {
    public XYZ(int j) {
        super(j);
    }

    public int subtraction() {
        return i - 10;
    }

    public int superSubtraction() {
        return super.subtraction();
    }
}

public class MainClass {
    public static void main(String[] args) throws Exception {
        XYZ a = new XYZ(50);
        System.out.println(a.subtraction()); // 40
        // to call super class method
        System.out.println(a.superSubtraction()); // 45
    }
}

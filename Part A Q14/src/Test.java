class University {
    protected void getData() {
        System.out.println("Inside University");
    }
}

class UiTM extends University {
    public void getData() {
        System.out.println("Inside UiTM");
    }
}

public class Test {
    public static void main(String args[]) {
        University obj = new UiTM();
        obj.getData(); // output: Inside UiTM
    }
}

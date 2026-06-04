class superc {
    public void display() {
        System.out.println("this is super class");
    }
}

class sub extends superc {
    public void display() {
        System.out.println("this is sub class");
    }
}

public class override {
    public static void main(String[] args) {
        superc s = new sub();
        s.display();
    }
}
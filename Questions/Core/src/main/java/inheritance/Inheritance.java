public class Inheritance {

    public static void main(String[] args) {
        A a = new A("This is A as A");
        a.showName();
        a.printSelf();
        a.printName();
        //a.printOwn();

        A ab = new B("This is B as A");
        ab.showName();
        ab.printSelf();
        ab.printName();
        //ab.printOwn();
        ((B) ab).printOwn();
        ab.getName();

        B bb = new B("This is B as B");
        bb.showName();
        bb.printSelf();
        bb.printOwn();
        bb.printName();

    }
}

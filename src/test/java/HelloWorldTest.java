public class HelloWorldTest {

    public void testHello(){
        System.out.println("Hello...");
    }

    public void testWorld(){
        System.out.println("World!!!");
    }

    public void testHelloWorld(){
        HelloWorld hw = new HelloWorld("Hello Dear World !!!");
        System.out.println(hw);
    }
}

import org.apache.commons.lang3.StringUtils;

/**
 * Created by jt on 2018-11-26.
 */
public class HelloWorld {

    private String hello;

    public HelloWorld(String hello) {
        this.hello = hello;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!!!! ");
        System.out.println(StringUtils.capitalize("hello world"));
    }

    @Override
    public String toString() {
        return this.hello;
    }
}

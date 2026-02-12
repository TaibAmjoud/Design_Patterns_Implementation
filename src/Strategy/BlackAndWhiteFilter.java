package Strategy;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying BlackAndWhite Filter");
    }
}

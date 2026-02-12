package Strategy;

public class Main {
    public static void main(){
        var imageStorage = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a");
    }
}

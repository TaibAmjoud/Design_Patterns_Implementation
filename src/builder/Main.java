package builder;

public class Main {
    public static void main(String[] args){
        User user = new User.UserBuilder()
                .setName("Taib")
                .setEmail("taib@mail.com")
                .setPhone("0600000000")
                .build();
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User bigBoss = new User("big", "bosss", 55);
        User smallBoss = new User("small", "bosss", 45);
        List<User> users = Arrays.asList(
                new User[]{
                        new User("Vas", "Gas", 15),
                        new User("Das", "Fes", 77),
                        new User("Das", "Has", 67),
                });
        Personal personal = new Personal(users);
        for (User user : personal) {
            System.out.println(user);
        }
        Collections.sort(users);
        System.out.println(users);

        Company company = new Company(bigBoss);

        smallBoss.setSubordinates(users);

        bigBoss.setSubordinates(Arrays.asList(smallBoss));


        for (User user : company) {
            System.out.println(user);

        }
    }
}


import java.util.Random;

public class Generator {
    static String[] lastNames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Miller"
            , "Davis", "Garcia", "Rodriguez", "Martinez", "Hernandez", "Lopez"
            , "Gonzalez", "Perez", "Taylor"};
    static String[] firstNames = {"Michael", "Christopher", "Matthew", "Joshua", "Daniel"
            , "David", "James", "Joseph", "John", "Nicholas", "Andrew", "Brandon",
            "Tyler", "William", "Ryan", "Jessica", "Ashley", "Emily", "Samantha", "Amanda",
            "Brittany", "Megan", "Stephanie", "Jennifer", "Elizabeth", "Lauren",
            "Nicole", "Rachel", "Hannah", "Katty"};



    public static Employee randomGenerate(){
        Random random1 = new Random();
        Random random = new Random();
        int index = random1.nextInt(2);
        if(index == 0){
            return new Worker(firstNames[random.nextInt(30)],
                    lastNames[random.nextInt(15)], random.nextInt(18,55),
                    random.nextDouble(5000, 10000), random.nextInt(21));
        }
        else {
            return new Freelancer(firstNames[random.nextInt(30)],
                    lastNames[random.nextInt(15)],random.nextInt(18,55),
                    random.nextDouble(500, 5000), random.nextInt(160));
        }
    }
}


public class Main {


    public static void main(String[] args) {
        HRAgency hrAgency = new HRAgency();
        Student john = new Student("John",1500,"Junior");
        Student edvard = new Student("Edvard",3000,"Middle");
        Student samantha = new Student("Samantha",6000,"Senior");
        Student michail = new Student("Michail",1000,"Junior");

        hrAgency.addSubscriber(michail);
        hrAgency.addSubscriber(john);
        hrAgency.addSubscriber(edvard);
        hrAgency.addSubscriber(samantha);



        Vacancy vacancyDeveloperJunior = new NewVacancy("Yabdex",
                "Developer",1200,"Junior");
        Vacancy vacancyDeveloperMiddle = new NewVacancy("Yabdex",
                "Developer",3500,"Middle");
        Vacancy vacancyDeveloperSenior = new NewVacancy("Yabdex",
                "Developer",6250,"Senior");


        hrAgency.uploadNewVacancy(vacancyDeveloperJunior,hrAgency);
        hrAgency.uploadNewVacancy(vacancyDeveloperMiddle,hrAgency);
        hrAgency.uploadNewVacancy(vacancyDeveloperSenior,hrAgency);



    }
}





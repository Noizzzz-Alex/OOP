public class Main {
    public static void main(String[] args) {
        Company yandex = new Company("Yandex", "Russia");
        Company google = new Company("Google","USA");
        Company tencent = new Company("Tencent","China");

        HRAgency hh = new HRAgency("HH");

        hh.registerCompany(yandex);
        hh.registerCompany(google);
        hh.registerCompany(tencent);

        Vacancy vacancyYandex1 = new Vacancy(yandex,"Java Developer",false,
                "Junior",1200,4);
        Vacancy vacancyYandex2 = new Vacancy(yandex,"Python Developer",false,
                "Junior",1200,4);
        Vacancy vacancyYandex3 = new Vacancy(yandex,"C# Developer",false,
                "Junior",1200,4);
        Vacancy vacancyYandex4 = new Vacancy(yandex,"Rubi Developer",false,
                "Junior",1200,4);
        Vacancy vacancyGoogle1 = new Vacancy(google,"Java Developer",false,
                "Middle",2000,4);
        Vacancy vacancyGoogle2 = new Vacancy(google,"Python Developer",false,
                "Middle",2500,4);
        Vacancy vacancyGoogle3 = new Vacancy(google,"C# Developer",false,
                "Middle",3000,4);
        Vacancy vacancyGoogle4 = new Vacancy(google,"Rubi Developer",false,
                "Middle",2760,4);
        Vacancy vacancyTencent1 = new Vacancy(tencent,"Java Developer",false,
                "Senior",4000,4);
        Vacancy vacancyTencent2 = new Vacancy(tencent,"Python Developer",false,
                "Senior",5400,4);
        Vacancy vacancyTencent3 = new Vacancy(tencent,"C# Developer",false,
                "Senior",5800,4);
        Vacancy vacancyTencent4 = new Vacancy(tencent,"Rubi Developer",false,
                "Senior",6500,4);



        Student alex = new Student("Alex", 1300, "Junior");
        Student mary = new Student("Mary",1100,"Junior");
        Student garry = new Student("garry", 1250, "Junior");
        Student john = new Student("john",900,"Junior");
        Student alice = new Student("alice", 2000, "Junior");
        Student gloria = new Student("gloria",1800,"Junior");
        Student harold = new Student("harold", 2500, "Junior");
        Student laura = new Student("laura",2100,"Junior");
        Student gina = new Student("gina", 1950, "Junior");
        Student aziza = new Student("aziza",1500,"Junior");

        Middle alex1 = new Middle("Alex", 2000, "Middle");
        Middle mary1 = new Middle("Mary",3500,"Middle");
        Middle garry1 = new Middle("garry", 3700, "Middle");
        Middle john1 = new Middle("john",2850,"Middle");
        Middle alice1 = new Middle("alice", 3100, "Middle");
        Middle gloria1 = new Middle("gloria",2900,"Middle");
        Middle harold1 = new Middle("harold", 3000, "Middle");
        Middle laura1 = new Middle("laura",4000,"Middle");
        Middle gina1 = new Middle("gina", 3300, "Middle");
        Middle aziza1 = new Middle("aziza",3500,"Middle");

        Senior alex2 = new Senior("Alex", 4500, "Senior");
        Senior mary2 = new Senior("Mary",5600,"Senior");
        Senior garry2 = new Senior("garry", 7000, "Senior");
        Senior john2 = new Senior("john",7600,"Senior");
        Senior alice2 = new Senior("alice", 6400, "Senior");
        Senior gloria2 = new Senior("gloria",7100,"Senior");
        Senior harold2 = new Senior("harold", 10000, "Senior");
        Senior laura2 = new Senior("laura",5600,"Senior");
        Senior gina2 = new Senior("gina", 5000, "Senior");
        Senior aziza2 = new Senior("aziza",8700,"Senior");



        hh.subscribe(alex);
        hh.subscribe(mary);
        hh.subscribe(garry);
        hh.subscribe(john);
        hh.subscribe(alice);
        hh.subscribe(gloria);
        hh.subscribe(harold);
        hh.subscribe(laura);
        hh.subscribe(gina);
        hh.subscribe(aziza);
        hh.subscribe(alex1);
        hh.subscribe(mary1);
        hh.subscribe(garry1);
        hh.subscribe(john1);
        hh.subscribe(alice1);
        hh.subscribe(gloria1);
        hh.subscribe(harold1);
        hh.subscribe(laura1);
        hh.subscribe(gina1);
        hh.subscribe(aziza1);
        hh.subscribe(alex2);
        hh.subscribe(mary2);
        hh.subscribe(garry2);
        hh.subscribe(john2);
        hh.subscribe(alice2);
        hh.subscribe(gloria2);
        hh.subscribe(harold2);
        hh.subscribe(laura2);
        hh.subscribe(gina2);
        hh.subscribe(aziza2);

        hh.addVacancy(vacancyYandex1);
        hh.addVacancy(vacancyYandex2);
        hh.addVacancy(vacancyYandex3);
        hh.addVacancy(vacancyYandex4);
        hh.addVacancy(vacancyGoogle1);
        hh.addVacancy(vacancyGoogle2);
        hh.addVacancy(vacancyGoogle3);
        hh.addVacancy(vacancyGoogle4);
        hh.addVacancy(vacancyTencent1);
        hh.addVacancy(vacancyTencent2);
        hh.addVacancy(vacancyTencent3);
        hh.addVacancy(vacancyTencent4);





    }
}

public class BuilderMain {

    public static void main(String[] args) {
        People people1 = new People.Builder()
                .name("Winston")
                .surname("Smith")
                .age(39)
                .isMarried(true)
                .build();

        System.out.println(people1);

        People people2 = new People.Builder()
                .name("Лев")
                .patronymic("Николаевич")
                .surname("Толстой")
                .age(96)
                .isMarried(true)
                .childrenCount(24)
                .passportSeries("666")
                .passportNumber("666666")
                .citizenship("Русь")
                .salary(1000000000)
                .build();

        System.out.println(people2);
    }
}

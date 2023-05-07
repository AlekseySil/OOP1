public class Main {
    public static void main(String[] args) {
        GryffindorStudents[] gryffindor = {
                new GryffindorStudents("Гарри Поттер", 90, 16, 15, 80, 10),
                new GryffindorStudents("Гермиона Грейнджер", 23, 67, 10, 56, 32),
                new GryffindorStudents("Рон Уизли", 59, 3, 90, 13, 0),
        };

        HufflepuffStudents[] hufflepuff = {
                new HufflepuffStudents("Захария Смит", 45,67,18,43,8),
                new HufflepuffStudents("Седрик Диггори", 99,1,39,71,54),
                new HufflepuffStudents("Джастин Финч-Флетчли", 42,26,76,39,80),
        };

        RavenclawStudents[] ravenclaws = {
                new RavenclawStudents("Чжоу Чанг",41,15,10,90,8,17),
                new RavenclawStudents("Падма Патил", 67,8,37,63,14,5),
                new RavenclawStudents("Маркус Белби", 13,87,1,47,83,74),
        };

        SlytherinStudents[] slytherins = {
                new SlytherinStudents("Драко Малфой", 37,20,19,5,62,17,43),
                new SlytherinStudents("Грэхэм Монтегю",80,7,31,26,8,25,98),
                new SlytherinStudents("Грегори Гойл",56,34,19,56,1,45,72),
        };



        Printer printService = new Printer();
        printService.print(gryffindor);
        printService.print(hufflepuff);
        printService.print(ravenclaws);
        printService.print(slytherins);

        HogwartsComparison hogwarts = new HogwartsComparison();
        hogwarts.compareGryffindor(gryffindor[0], gryffindor[1], gryffindor[2]);

        HogwartsComparison hogwarts1 = new HogwartsComparison();
        hogwarts1.compareHufflepuff(hufflepuff[0], hufflepuff[1], hufflepuff[2]);

        HogwartsComparison hogwarts2 = new HogwartsComparison();
        hogwarts2.compareRavenclaw(ravenclaws[0], ravenclaws[1], ravenclaws[2]);

        HogwartsComparison hogwarts3 = new HogwartsComparison();
        hogwarts3.compareSlytherin(slytherins[0], slytherins[1], slytherins[2]);

        HogwartsComparison hogwarts4 = new HogwartsComparison();
        hogwarts4.compareAnyStudent(gryffindor[0], ravenclaws[1]);

    }
}
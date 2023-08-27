public class Main {
    public static void main(String[] args){
    var dog = 8.0;
    var cat = 3.6;
    var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    dog = dog + 4;
    cat = cat + 4;
    paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    dog = dog - 3.5;
    cat = cat - 1.6;
    paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    var friend = 19;
        System.out.println(friend);
    friend = friend + 2;
        System.out.println(friend);
    friend = friend / 7;
        System.out.println(friend);

    var frog = 3.5;
        System.out.println(frog);
    frog = frog * 10;
        System.out.println(frog);
    frog = frog / 3.5;
        System.out.println(frog);
    frog = frog + 4;
        System.out.println(frog);

    var boxer1 = 78.2;
    var boxer2 = 82.7;
    var boxerWeight1 = boxer1 + boxer2;
        System.out.println("Общая масса боксеров " +boxerWeight1 +" кг!");
    var boxerWeight2 = boxer1 -boxer2;
        System.out.println("Разница в весе " +boxerWeight2 +" кг (через вычитание)");
    var boxerWeight3 = 82.7 - 78.2;
        System.out.println("Разница в весе " +boxerWeight3 +" кг (через вычитание от большего)");
    var boxerWeight4 = boxer2 % boxer1;
        System.out.println("Разница в весе " +boxerWeight4 +" кг (через остаток от деления)");


    var totalHours = 640;
    var dayHours = 8;
    var employees = totalHours / dayHours;
        System.out.println("Всего работников в компании - " +employees +" человек");
    employees = employees + 94;
    var dayHours2 = totalHours / employees;
        System.out.println("Если в компании работает " +employees +" человека, то всего " +dayHours2 +" часа работы может быть поделено между сотрудниками");

}
}
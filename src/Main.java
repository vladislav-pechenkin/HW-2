public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;

        System.out.println(paper);
        dog +=4;
        System.out.println(dog);
        cat +=4;
        System.out.println(cat);
        paper +=4;
        System.out.println(paper);

        var nevDog = 8.0;
        System.out.println(nevDog);
        var nevCat = 3.6;
        System.out.println(nevCat);
        var nevPaper = 763789;
        System.out.println(nevPaper);

        nevDog -= 3.5;
        System.out.println(nevDog);
        nevCat -= 1.6;
        System.out.println(nevCat);
        nevPaper -= 7639;
        System.out.println(nevPaper);

        var friend = 19;
        System.out.println(friend);
        friend +=2;
        System.out.println(friend);
        friend /=7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog *=10;
        System.out.println(frog);
        frog /=3.5;
        System.out.println(frog);
        frog +=4;
        System.out.println(frog);

        var boxerOne = 78.2;
        System.out.println("Масса первого боксера " + boxerOne + " кг!");
        var boxerTwo = 82.7;
        System.out.println("Масса второго боксера " + boxerTwo + " кг!");
        var totalWeight = boxerOne + boxerTwo;
        System.out.println("Общая масса двух боксеров составляет " + totalWeight + " кг!");
        var differenceBoxing = (boxerTwo - boxerOne);
        System.out.println("Разница между массами бойцов составляет " + differenceBoxing + " кг!");
    }
}
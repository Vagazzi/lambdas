package org.example;

import org.example.interfaces.*;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Operations operations = (x, y) -> x * y;
        Dungeon dungeon = n -> n * n;
        Operations calc = ((x, y) -> x - y);
        Sucktion sucktion = (() -> System.out.println("ah fuck you leatherman"));

        Generic<Integer> integerGeneric = ((x, y) -> (x - y) * (x + y));
        Generic<String> stringGeneric = ((x, y) -> x + y + x + y);

        Equality eq = (n) -> n > 0;

        int[] array = {-1, -2, -3, -4, -5, -6, -7, -8, -9};

        Integer sup = integerGeneric.calc(322, 228);
        String concatenation = stringGeneric.calc(" i love", " to win");
        int result = calc.calculate(10, 14);
        int dung = dungeon.slave(32);

        System.out.println(dung);
        System.out.println(result);
        System.out.println(sup);
        System.out.println(concatenation);
        System.out.println(summarize(array, eq));

        Sucktion vanSama = changeLambda("leatherman");
        vanSama.suck();

        Sucktion dungeonMaster = changeLambda("dungeon_master");
        dungeonMaster.suck();

        Sucktion vanish = changeLambda("Aniki");
        vanish.suck();

        Predicate<Integer> predicate = (x)->x<0;

        System.out.println(predicate.test(10));
        System.out.println(predicate.test(-12321));
    }

    public static int summarize(int[] array, Equality eq) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (eq.isPositive(array[i])) {
                temp += array[i];
            }
        }
        return temp;
    }

    private static Sucktion changeLambda(String caseOf) {
        switch (caseOf) {

            case "sucktion":
                return () -> System.out.println("Sucktion!");

            case "dungeon_master":
                return () -> System.out.println("Im a dungeon master");

            case "leatherman":
                return () -> System.out.println("Ah fuck you leatherman!");

            default:
                return () -> System.out.println("НА РАБОТУ, СОРТИР ЧИСТИТЬ!");

        }
    }
}

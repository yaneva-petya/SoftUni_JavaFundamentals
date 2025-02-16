package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDoNotGo_09{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> pokemonList = Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sumOfRemoved = 0;
        while (!pokemonList.isEmpty()) {
            int index = Integer.parseInt(s.nextLine());

            if (index < 0) {
                int removedElement = pokemonList.get(0);
                sumOfRemoved += removedElement;
                pokemonList.remove(0);

                pokemonList.add(0, pokemonList.get(pokemonList.size() - 1));
                modifier(pokemonList, removedElement);

            } else if (index > pokemonList.size() - 1) {
                int removedElement = pokemonList.get(pokemonList.size() - 1);
                sumOfRemoved += removedElement;
                pokemonList.remove(pokemonList.size() - 1);


                pokemonList.add(pokemonList.get(0));
                modifier(pokemonList, removedElement);
            } else {
                int removedElement = pokemonList.get(index);
                sumOfRemoved += removedElement;

                pokemonList.remove(index);
                modifier(pokemonList, removedElement);
            }
        }
        System.out.println(sumOfRemoved);
    }

    public static void modifier(List<Integer> pokemonList, int removedElement) {
        for (int i = 0; i < pokemonList.size(); i++) {
            int currentElement = pokemonList.get(i);
            if (currentElement <= removedElement) {
                currentElement += removedElement;
            } else {
                currentElement -= removedElement;
            }
            pokemonList.set(i, currentElement);
        }
    }
}

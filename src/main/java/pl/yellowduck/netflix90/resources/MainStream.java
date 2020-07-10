package pl.yellowduck.netflix90.resources;

import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainStream {

    public static void main(String[] args) {
        List<String> capitals = List.of("Warsaw", "Berlin", "Amsterdam", "Lisbona", "Paris", "Rome", "London");

        Set<String> w = capitals.stream()
                .filter(p -> p.startsWith("W"))
                .collect(Collectors.toSet());
        System.out.println(w);

        Set<String> result = new HashSet<>();
        for (String capital : capitals) {
            if (capital.startsWith("L")) {
                result.add(StringUtils.reverse(capital.toUpperCase()));
            }
        }
        System.out.println(result);

        Set<String> capitalWithReversed = capitals.stream()
                .filter(p -> p.startsWith("L"))
                .map(String::toUpperCase)
                .map(StringUtils::reverse)
                .collect(Collectors.toSet());
        System.out.println(capitalWithReversed);

        capitals.stream()
                .filter(p -> p.startsWith("O"))
                .findAny()
                .ifPresentOrElse(p -> System.out.println(p), () -> System.out.println("Nie znaleziono"));
    }
}

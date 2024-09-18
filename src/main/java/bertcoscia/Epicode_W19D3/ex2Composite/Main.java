package bertcoscia.Epicode_W19D3.ex2Composite;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Faker faker = new Faker();

        Pagina p1 = new Pagina(1, faker.friends().quote());
        Pagina p2 = new Pagina(2, faker.friends().quote());
        Pagina p3 = new Pagina(3, faker.friends().quote());
        Pagina p4 = new Pagina(4, faker.friends().quote());
        Pagina p5 = new Pagina(5, faker.friends().quote());
        Pagina p6 = new Pagina(6, faker.friends().quote());
        Pagina p7 = new Pagina(7, faker.friends().quote());

        List<Component> s1List = new ArrayList<>();
        s1List.add(p1);
        s1List.add(p2);
        s1List.add(p3);
        Sezione s1 = new Sezione("Sezione 1", s1List);

        List<Component> s2List = new ArrayList<>();
        s2List.add(p4);
        s2List.add(p5);
        s2List.add(p6);
        s2List.add(p7);
        Sezione s2 = new Sezione("Sezione 2", s2List);

        List<Component> componentsLibro = new ArrayList<>();
        componentsLibro.add(s1);
        componentsLibro.add(s2);
        List<String> autoriList = new ArrayList<>();
        autoriList.add(faker.book().author());
        autoriList.add(faker.book().author());
        autoriList.add(faker.book().author());
        autoriList.add(faker.book().author());
        Libro libro = new Libro(faker.book().title(), componentsLibro, autoriList, 25.99);

        libro.stampa();
    }
}

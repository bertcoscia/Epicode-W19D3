package bertcoscia.Epicode_W19D3.ex2Composite;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Sezione implements Component{
    private String titolo;
    private List<Component> components = new ArrayList<>();

    public Sezione(String titolo, List<Component> components) {
        this.titolo = titolo;
        this.components = components;
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }

    @Override
    public void stampa() {
        System.out.println("Sezione " + this.getTitolo());
        System.out.println("Numero di pagine: " + this.getNumeroPagine());
        for (Component component : components) {
            component.stampa();
        }
    }

    @Override
    public int getNumeroPagine() {
        int numeroPagine = 0;
        for (Component component : components) {
            numeroPagine += component.getNumeroPagine();
        }
        return numeroPagine;
    }
}

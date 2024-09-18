package bertcoscia.Epicode_W19D3.ex2Composite;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Libro implements Component {
    private String titolo;
    private List<Component> components = new ArrayList<>();
    private List<String> autori = new ArrayList<>();
    private double prezzo;

    public void addComponent(Component component) {
        this.components.add(component);
    }

    public void removeComponent(Component component) {
        this.components.remove(component);
    }


    @Override
    public void stampa() {
        System.out.println("Libro: " + this.getTitolo());
        StringBuilder autori = new StringBuilder();
        for (int i = 0; i < this.autori.size(); i++) {
            if (i != this.autori.size() - 1) {
                autori.append(this.autori.get(i)).append(", ");
            } else {
                autori.append(this.autori.get(i)).append(".");
            }
        }
        System.out.println("Autori: " + autori);
        System.out.println("Numero di pagine: " + this.getNumeroPagine());
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

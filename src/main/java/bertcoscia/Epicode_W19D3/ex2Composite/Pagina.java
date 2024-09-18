package bertcoscia.Epicode_W19D3.ex2Composite;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Pagina implements Component{
    private int numero;
    private String testo;

    @Override
    public void stampa() {
        System.out.println(this.toString());
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }
}

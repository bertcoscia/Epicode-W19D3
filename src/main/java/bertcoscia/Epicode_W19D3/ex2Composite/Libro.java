package bertcoscia.Epicode_W19D3.ex2Composite;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Libro {
    List<Sezione> sezioni = new ArrayList<>();
    List<String> autori = new ArrayList<>();
    private double prezzo;

}

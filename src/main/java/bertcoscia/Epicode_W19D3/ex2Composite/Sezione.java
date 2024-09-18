package bertcoscia.Epicode_W19D3.ex2Composite;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Sezione {
    List<Sottosezione> sottosezioni = new ArrayList<>();
    List<Pagina> pagine = new ArrayList<>();
}

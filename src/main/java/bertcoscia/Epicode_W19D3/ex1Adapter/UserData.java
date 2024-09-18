package bertcoscia.Epicode_W19D3.ex1Adapter;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserData implements DataSource {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}

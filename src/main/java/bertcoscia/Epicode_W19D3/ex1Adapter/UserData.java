package bertcoscia.Epicode_W19D3.ex1Adapter;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserData implements DataSource {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
        System.out.println(nomeCompleto);
        System.out.println(eta);
    }
}

package bertcoscia.Epicode_W19D3.ex1Adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class Info {
    private String nome;
    private String cognome;
    private Date dataDiNascita;
}

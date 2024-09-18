package bertcoscia.Epicode_W19D3.ex1Adapter;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

@AllArgsConstructor
public class InfoAdapter extends UserData implements DataSource{
    private Info info;

    @Override
    public String getNomeCompleto() {
        return this.info.getNome() + " " + this.info.getCognome();
    }

    @Override
    public int getEta() {
        LocalDate dataNascita = this.info.getDataDiNascita()
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        Long eta = ChronoUnit.YEARS.between(dataNascita, LocalDate.now());
        return eta.intValue();
    }
}

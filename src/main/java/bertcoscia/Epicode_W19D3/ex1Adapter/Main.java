package bertcoscia.Epicode_W19D3.ex1Adapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        UserData user = new UserData("Aldo Baglio", 30);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Info info = new Info("Aldo", "Baglio", sdf.parse("18-09-1994"));
        InfoAdapter infoAdapter = new InfoAdapter(info);
        user.getData(user);
        infoAdapter.getData(infoAdapter);
    }
}

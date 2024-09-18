package bertcoscia.Epicode_W19D3.ex1Adapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Info info = new Info("Aldo", "Baglio", sdf.parse("18-09-1994"));
        DataSource ds = new InfoAdapter(info);
        UserData userData = new UserData("", 0);
        userData.getData(ds);
        System.out.println(userData);
    }
}

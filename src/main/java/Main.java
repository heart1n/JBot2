import javafx.scene.control.Skin;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class Main {

    public static void main(String[] args) throws Exception {

        String token = "NTEzNzUzNzY3NTc4MDQyMzY4.DtMu5A.tBW2XbChUpc8xGmVqxTCj1l-ctI";

        JDA jda = new JDABuilder(token).build();
        jda.addEventListener(new EventListener());
        jda.addEventListener(new SkinListener());

    }
}
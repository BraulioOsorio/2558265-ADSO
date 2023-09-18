package principal;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Principal {
    public static void main(String[] args) {
        ConsumoAPI ejemplo = new ConsumoAPI();
        Gson gson = new Gson();
        
        Menu menu = new Menu(ejemplo,gson);
        menu.setVisible(true);
        menu.setResizable(false);
        menu.setLocationRelativeTo(null);
    }    
}

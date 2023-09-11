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
        
        
        // POST con Datos
        Map<String, String> updateData = new HashMap<>();
        updateData.put("cedula", "102200");
        updateData.put("nombres", "Oscar JAVA UPDATE");
        updateData.put("apellidos", "Loaiza JAVA UPDATE");
        updateData.put("telefono", "333333");
        updateData.put("direccion", "Calle 20");
        updateData.put("email", "oscar@mail.com");
        System.out.println("Consumo UPDATE: " + ejemplo.consumoPOST("http://localhost/02APIenPHP/Update.php", updateData));
        
        
        
        // GET sin datos
        String datos = ejemplo.consumoGET("http://localhost/02APIenPHP/Obtener.php");
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(datos, JsonObject.class);
        JsonArray registros = jsonObject.getAsJsonArray("registros");
        
        for(JsonElement registro : registros){
            JsonObject registrosOb = registro.getAsJsonObject();
            int cedula = registrosOb.get("documento").getAsInt();
            String nombres = registrosOb.get("nombres").getAsString();
            String apellidos = registrosOb.get("apellidos").getAsString();
            String telefono = registrosOb.get("telefono").getAsString();
            String direccion = registrosOb.get("direccion").getAsString();
            String email = registrosOb.get("email").getAsString();
            
            System.out.println("Nombre del usuario: " + nombres + " " + apellidos);
            System.out.println("Cedula: " + cedula);
            System.out.println("Telefono: " + telefono);
            System.out.println("Direccion: " + direccion);
            System.out.println("Email: " + email);
            System.out.println();
        }
        // GET con Datos
        Map<String, String> getData = new HashMap<>();
        getData.put("cedula", "108802");
        String unaPersona = ejemplo.consumoGET("http://localhost/02APIenPHP/getPersona.php", getData);
        JsonObject valor = gson.fromJson(unaPersona,JsonObject.class);
        
        int cedula = valor.get("cedula").getAsInt();
        String nombres = valor.get("nombres").getAsString();
        String apellidos = valor.get("apellidos").getAsString();
        String telefono = valor.get("telefono").getAsString();
        String direccion = valor.get("direccion").getAsString();
        String email = valor.get("email").getAsString();

        System.out.println("Nombre del usuario: " + nombres + " " + apellidos);
        System.out.println("Cedula: " + cedula);
        System.out.println("Telefono: " + telefono);
        System.out.println("Direccion: " + direccion);
        System.out.println("Email: " + email);
        
        // POST con Datos
        Map<String, String> insertData = new HashMap<>();
        insertData.put("cedula", "102200");
        insertData.put("nombres", "Oscar JAVA");
        insertData.put("apellidos", "Loaiza JAVA");
        insertData.put("telefono", "333333333");
        insertData.put("direccion", "Calle 20");
        insertData.put("email", "oscar@mail.com");
        System.out.println("Consumo INSERT: " + ejemplo.consumoPOST("http://localhost/02APIenPHP/Insert.php", insertData));
        
        // POST con Datos
        Map<String, String> deleteData = new HashMap<>();
        deleteData.put("cedula", "102200");
        System.out.println("Consumo DELETE: " + ejemplo.consumoPOST("http://localhost/02APIenPHP/Delete.php", deleteData));
        
    }    
}
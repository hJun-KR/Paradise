package SaveLoad;

import com.google.gson.Gson;
import setting.Player;

import java.io.FileReader;
import java.io.IOException;

public class PlayerJsonLoader {
    private static final String FILE_PATH = "db/PlayerData.json";

    public static Player loadData() {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(FILE_PATH)) {
            return gson.fromJson(reader, Player.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}


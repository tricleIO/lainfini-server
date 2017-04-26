package application.configuration.gsonAdapter;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import springfox.documentation.spring.web.json.Json;

import java.lang.reflect.Type;

/**
 * Created by pfilip on 3.4.17.
 */
public class SpringfoxJsonToGsonAdapter implements JsonSerializer<Json> {

    @Override
    public JsonElement serialize(Json json, Type type, JsonSerializationContext context) {
        final JsonParser parser = new JsonParser();
        return parser.parse(json.value());
    }
}
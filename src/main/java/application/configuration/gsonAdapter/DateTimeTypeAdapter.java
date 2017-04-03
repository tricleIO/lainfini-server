package application.configuration.gsonAdapter;

import com.google.gson.*;
import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

import java.lang.reflect.Type;

/**
 * Created by pfilip on 3.4.17.
 */
public class DateTimeTypeAdapter implements JsonSerializer<DateTime>,
        JsonDeserializer<DateTime> {
    @Override
    public DateTime deserialize(JsonElement json, Type typeOfT,
                                JsonDeserializationContext context) throws JsonParseException {
        return DateTime.parse(json.getAsString());
    }

    @Override
    public JsonElement serialize(DateTime src, Type typeOfSrc,
                                 JsonSerializationContext context) {
        return new JsonPrimitive(ISODateTimeFormat
                .dateTimeNoMillis()
                .print(src));
    }
}

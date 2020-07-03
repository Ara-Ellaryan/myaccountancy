package am.ara.mynotebook.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonUtil {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    private static final Logger logger = LoggerFactory.getLogger(JsonUtil.class);

    public static String serialize(Object obj){
        String jsonString = "";

        try {
            jsonString = objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            logger.error("ERROR", e);
        }

        return jsonString;
    }

    public static <T> T deserialize(String str, TypeReference<T> type){
        try {
            return objectMapper.readValue(str, type);
        } catch (JsonProcessingException e) {
            logger.error("ERROR", e);
        }
        return null;
    }
}

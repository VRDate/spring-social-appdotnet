package org.springframework.social.appdotnet.api.data.user;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.springframework.social.appdotnet.api.data.ADNAnnotation;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Arik Galansky
 */
public class ADNUserUpdate extends ADNUser {

    private ADNUserUpdate(String name, ADNUserDescription description, String timezone, String locale, List<ADNAnnotation> annotations) {
        super(null, null, name, description, timezone, locale, null, null, null, null, null, null, false, false, false, false, false, false, null, null, annotations);
    }

    public static class Builder {
        private String name;
        private ADNUserDescription description;
        private String timezone;
        private String locale;
        private List<ADNAnnotation> annotations;

        public Builder(String name, String description, String timezone, String locale) {
            this.name = name;
            this.description = new ADNUserDescription(description, null, null);
            this.timezone = timezone;
            this.locale = locale;
        }

        public Builder annotation(String type, Map<String, Object> value) {
            if (this.annotations == null) {
                annotations = new ArrayList<ADNAnnotation>();
            }
            annotations.add(new ADNAnnotation(type, value));
            return this;
        }

        public ADNUserUpdate build() {
            return new ADNUserUpdate(this.name, this.description, this.timezone, this.locale, this.annotations);
        }
    }

    public String toJson() throws IOException {
        JsonFactory jFactory = new JsonFactory();
        StringWriter writer = new StringWriter();
        JsonGenerator jsonGenerator = jFactory.createJsonGenerator(writer);
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("name", getName());
        jsonGenerator.writeStringField("timezone", getTimezone());
        jsonGenerator.writeStringField("locale", getLocale());
        jsonGenerator.writeObjectFieldStart("description");
        jsonGenerator.writeStringField("text",getDescription().getText());
        jsonGenerator.writeEndObject();
        if(getAnnotations() != null && !getAnnotations().isEmpty()) {
            ObjectMapper mapper = new ObjectMapper();
            ObjectWriter mapperWriter = mapper.writer();
            jsonGenerator.writeArrayFieldStart("annotations");
            for (ADNAnnotation annotation : getAnnotations()) {
                jsonGenerator.writeStartObject();
                jsonGenerator.writeStringField("type", annotation.getType());
                jsonGenerator.writeObjectFieldStart("value");
                for(Map.Entry<String, Object> entry : annotation.getValue().entrySet()) {
                    jsonGenerator.writeObjectField(entry.getKey(), entry.getValue());
                }
                jsonGenerator.writeEndObject();
                jsonGenerator.writeEndObject();
            }
            jsonGenerator.writeEndArray();
        }
        jsonGenerator.writeEndObject();
        jsonGenerator.close();
        return writer.toString();
    }
}

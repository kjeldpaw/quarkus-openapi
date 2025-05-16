package dk.figge.quarkus.openapi.runtime.generator;

import dk.figge.quarkus.openapi.runtime.Configuration;
import io.swagger.v3.oas.models.OpenAPI;

import java.util.Map;

public class ModelGenerator {

    public Map<String, Model> generate(final OpenAPI openApi, final Configuration configuration) {
        openApi.getComponents().getSchemas().forEach((name, schema) -> {

        });
    }

}

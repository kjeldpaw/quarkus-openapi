package dk.figge.quarkus.openapi.runtime.parser;

import dk.figge.quarkus.openapi.runtime.Configuration;
import io.swagger.parser.OpenAPIParser;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.parser.exception.ReadContentException;
import org.jboss.logging.Logger;

import java.util.ArrayList;
import java.util.Collection;

public class OpenApiParser {
    private static final Logger logger = Logger.getLogger(OpenApiParser.class);

    public Collection<OpenAPI> parse(final Configuration configuration) {
        final var parser = new OpenAPIParser();
        final var result = new ArrayList<OpenAPI>();
        configuration.urls().forEach(url -> {
            try {
                final var parseResult = parser.readLocation(url, null, null);
                if (!parseResult.getMessages().isEmpty()) {
                    parseResult.getMessages().forEach(logger::error); // validation errors and warnings
                    throw new ParseException();
                }
                result.add(parseResult.getOpenAPI() );
            } catch (ReadContentException e) {
                throw new ParseException(e);
            }
        });
        return result;
    }
}

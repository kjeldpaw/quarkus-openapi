package dk.figge.quarkus.openapi.runtime.generator;

import dk.figge.quarkus.openapi.runtime.parser.OpenApiParser;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class OpenApiParserTest {

    @Test
    void parseOpenApiFileFromClassPath() {
        final var parser = new OpenApiParser();
        final var result = parser.parse(() -> Set.of("openapi.yaml"));
        assertThat(result).isNotEmpty();
    }

}

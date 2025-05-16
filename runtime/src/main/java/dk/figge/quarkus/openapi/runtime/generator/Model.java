package dk.figge.quarkus.openapi.runtime.generator;

import com.palantir.javapoet.TypeName;
import com.palantir.javapoet.TypeSpec;
import io.swagger.v3.oas.models.media.Schema;

public record Model(Schema schema, TypeName typeName, TypeSpec typeSpec) {
}

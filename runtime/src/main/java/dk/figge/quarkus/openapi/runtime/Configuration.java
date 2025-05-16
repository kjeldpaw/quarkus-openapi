package dk.figge.quarkus.openapi.runtime;

import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;

import java.util.Set;

@ConfigMapping(prefix = "quarkus.openapi")
@ConfigRoot(phase = ConfigPhase.BUILD_TIME)
public interface Configuration {

    Set<String> urls();
}

package mx.uv.coatza.aejl.copsboot;

import java.util.UUID;

import mx.uv.coatza.aejl.copsboot.orm.jpa.InMemoryUniqueIdGenerator;
import mx.uv.coatza.aejl.copsboot.orm.jpa.UniqueIdGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CopsbootApplicationConfiguration {
    @Bean
    public UniqueIdGenerator<UUID> uniqueIdGenerator() {
        return new InMemoryUniqueIdGenerator();
    }
}

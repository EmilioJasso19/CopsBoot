package mx.uv.coatza.aejl.copsboot.user.web;

import com.c4_soft.springaddons.security.oauth2.test.webmvc.AutoConfigureAddonsWebmvcResourceServerSecurity;
import mx.uv.coatza.aejl.copsboot.CopsbootApplicationConfiguration;
import mx.uv.coatza.aejl.copsboot.infraestructure.security.WebSecurityConfiguration;
import mx.uv.coatza.aejl.copsboot.user.UserRepositoryImpl;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@WebMvcTest(controllers = UserRestController.class)
@AutoConfigureAddonsWebmvcResourceServerSecurity
@Import({
        WebSecurityConfiguration.class,
        CopsbootApplicationConfiguration.class,  // Configuración de generación de UUID
        UserRepositoryImpl.class  // Si usas repositorios personalizados
})
public @interface CopsbootControllerTest {
    @AliasFor(annotation = WebMvcTest.class, attribute = "value")
    Class<?>[] value() default {};

    @AliasFor(annotation = WebMvcTest.class, attribute = "controllers")
    Class<?>[] controllers() default {};

}

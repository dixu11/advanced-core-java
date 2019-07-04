package reflection.practise.sda;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME) // po co to?
public @interface Label {
    String value();

    int order();
} 
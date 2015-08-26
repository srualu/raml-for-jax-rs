package org.raml.jaxrs.codegen.tools.annotations;

/**
 * Created by srualuri on 8/11/2015.
 */

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiBodyPartParam {
     String value();

     boolean required();

     Class<?> classValue();

}

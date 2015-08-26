package org.raml.jaxrs.codegen.tools.annotations;

import java.lang.annotation.Inherited;

/**
 * Created by srualuri on 8/11/2015.
 */

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiMultipartParam {

          ApiBodyPartParam[] value();
}

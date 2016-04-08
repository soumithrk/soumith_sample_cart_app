/**
 * 
 */
package com.ekart.springbootjetty.sample.service.utility;

import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

/**
 * @author vijay.daniel
 *
 */
public final class LogLevel {

    // See http://www.slf4j.org/faq.html#fatal
    public static final Marker FATAL = MarkerFactory.getMarker("FATAL");

    // TODO: Configure logback to publish marker as well

    private LogLevel() {

    }
}

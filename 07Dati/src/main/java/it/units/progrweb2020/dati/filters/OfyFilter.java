package it.units.progrweb2020.dati.filters;

import com.googlecode.objectify.ObjectifyFilter;
import javax.servlet.annotation.WebFilter;

/**
 *
 * @author giorgio
 */
@WebFilter(urlPatterns = {"/*"})
public class OfyFilter extends ObjectifyFilter {

}

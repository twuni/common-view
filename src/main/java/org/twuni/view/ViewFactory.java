package org.twuni.view;

import java.util.Map;

public interface ViewFactory {

	public String createView( String name );

	public String createView( String name, Map<String, ?> model );

}

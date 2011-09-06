package org.twuni.view;

import java.util.Map;

public interface ViewFactory {

	public View createView( String name );

	public View createView( String name, Map<String, ?> model );

}

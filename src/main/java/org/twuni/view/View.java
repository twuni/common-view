package org.twuni.view;

import java.util.HashMap;
import java.util.Map;

public class View {

	private final String name;
	private final Map<String, ?> model;

	public View( String name, Map<String, ?> model ) {
		this.name = name;
		this.model = model;
	}

	public View( String name ) {
		this( name, new HashMap<String, Object>() );
	}

	public final String getName() {
		return name;
	}

	public final Map<String, ?> getModel() {
		return model;
	}

}

package com.vaadin.flow.demo.helloworld;

import com.vaadin.ui.Component;
import com.vaadin.ui.Tag;
import com.vaadin.ui.common.HasValue;
import com.vaadin.ui.common.HtmlImport;

@Tag("arithmetic-field")
@HtmlImport("bower_components/arithmetic-field/arithmetic-field.html")
public class ArithmeticField extends Component implements HasValue<ArithmeticField, String> {
	public ArithmeticField() {
		getElement().synchronizeProperty("value", "value-changed");
	}

	@Override
	public String getValue() {
		return getElement().getProperty("value");
	}

	@Override
	public void setValue(String value) {
		getElement().setProperty("value", value);

	}

	public void setPlaceholder(String placeholder) {
		getElement().setProperty("placeholder", placeholder == null ? "" : placeholder);
	}

}
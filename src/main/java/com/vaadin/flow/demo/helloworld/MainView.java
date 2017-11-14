/*
 * Copyright 2000-2017 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.flow.demo.helloworld;

import com.vaadin.router.Route;
import com.vaadin.ui.button.Button;
import com.vaadin.ui.common.HtmlImport;
import com.vaadin.ui.html.Label;
import com.vaadin.ui.layout.VerticalLayout;

/**
 * The main view contains a button and a template element.
 */
@HtmlImport("styles.html")
@Route("")
public class MainView extends VerticalLayout {

	private Button button;
	private ArithmeticField arithmeticField;

	public MainView() {
		arithmeticField = new ArithmeticField();
		
		arithmeticField.setPlaceholder("Input is evaled on change");

		button = new Button("Click to change field value", event -> arithmeticField.setValue("" + 42));
		Button echoButton = new Button("What's the value?", event -> echo());

		add(button, arithmeticField, echoButton);

		arithmeticField.addValueChangeListener(e -> {
			add(new Label("Value changed from: '" + e.getOldValue() + "' into '" + e.getValue() + "'"));
		});
	}

	private void echo() {
		add(new Label("Value is: '" + arithmeticField.getValue() + "'"));
	}

}

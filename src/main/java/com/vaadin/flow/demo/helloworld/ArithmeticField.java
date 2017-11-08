package com.vaadin.flow.demo.helloworld;

import com.vaadin.ui.Component;
import com.vaadin.ui.Tag;
import com.vaadin.ui.common.HtmlImport;

@Tag("arithmetic-field")
@HtmlImport("bower_components/arithmetic-field/arithmetic-field.html")
public class ArithmeticField extends Component {
  public ArithmeticField() {
  }
  public void setValue(int value) {
    getElement().setProperty("value", value);
  }
  public int getValue() {
    return getElement().getProperty("value", 0);
  }
}
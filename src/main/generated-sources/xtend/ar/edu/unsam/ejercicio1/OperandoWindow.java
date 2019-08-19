package ar.edu.unsam.ejercicio1;

import ar.edu.unsam.ejercicio1.Operando;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.lacar.ui.model.ControlBuilder;

@SuppressWarnings("all")
public class OperandoWindow extends MainWindow<Operando> {
  public OperandoWindow() {
    super(new Operando());
  }
  
  public static void main(final String[] args) {
    new OperandoWindow().startApplication();
  }
  
  @Override
  public void createContents(final Panel mainPanel) {
    this.setTitle("Operaciones");
    Label _label = new Label(mainPanel);
    _label.setText("Operando1");
    new TextBox(mainPanel).<ControlBuilder>value();
    Label _label_1 = new Label(mainPanel);
    _label_1.setText("Operando2");
    new TextBox(mainPanel).<ControlBuilder>value();
    final Panel opPanel = new Panel(mainPanel);
    HorizontalLayout _horizontalLayout = new HorizontalLayout();
    opPanel.setLayout(_horizontalLayout);
    Button _button = new Button(opPanel);
    final Procedure1<Button> _function = (Button it) -> {
      it.setCaption("+");
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function);
    Button _button_1 = new Button(opPanel);
    _button_1.setCaption("-");
    Button _button_2 = new Button(opPanel);
    _button_2.setCaption("*");
    Button _button_3 = new Button(opPanel);
    _button_3.setCaption("/");
    Label _label_2 = new Label(mainPanel);
    _label_2.setText("Resultado");
    new TextBox(mainPanel).<ControlBuilder>value();
  }
}

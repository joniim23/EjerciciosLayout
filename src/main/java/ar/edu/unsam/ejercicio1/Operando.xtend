package ar.edu.unsam.ejercicio1

import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.windows.MainWindow
import org.uqbar.commons.model.annotations.Observable

@Observable
class Operando {
	
}

class OperandoWindow extends MainWindow<Operando> {
	
	new() {
		super(new Operando)
	}
	
	static def main(String[] args) {
		new OperandoWindow().startApplication
	} 
	
	override createContents(Panel mainPanel) {
		this.title = "Operaciones"
		
		new Label(mainPanel).text = "Operando1"
		new TextBox(mainPanel).value
		new Label(mainPanel).text = "Operando2"
		new TextBox(mainPanel).value
		
		val opPanel = new Panel(mainPanel)
		opPanel.layout = new HorizontalLayout
		
		new Button(opPanel) => [
			caption = "+"
		]
		new Button(opPanel).caption = "-"
		new Button(opPanel).caption = "*"
		new Button(opPanel).caption = "/"
		
		new Label(mainPanel).text = "Resultado"
		new TextBox(mainPanel).value
		
	}
	
}
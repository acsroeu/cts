package ro.ase.acs.main;

import ro.ase.acs.memento.DocumentEditor;
import ro.ase.acs.memento.TextDocument;
import ro.ase.acs.state.DeliveringProduct;
import ro.ase.acs.state.SelectingProduct;
import ro.ase.acs.state.VendingMachine;
import ro.ase.acs.template.Human;
import ro.ase.acs.template.PartsMover;
import ro.ase.acs.template.Robot;

public class ProgMain {
	
	public static void main(String[] args) {
		//State
		VendingMachine vendingMachine =
				new VendingMachine();
		vendingMachine.pressButton();
		//...
		vendingMachine.setState(new SelectingProduct());
		vendingMachine.pressButton();
		//...
		vendingMachine.setState(new DeliveringProduct());
		vendingMachine.pressButton();
		
		//Memento
		TextDocument doc = new TextDocument();
		doc.setText("Capitolul 1");
		DocumentEditor editor = new DocumentEditor();
		editor.setDocument(doc);
		doc.appendText("\r\nCapitolul 2");
		System.out.println(editor.getDocument().getText());
		editor.saveDocument();
		doc.appendText("\r\nCapitolul 3");
		System.out.println();
		System.out.println(editor.getDocument().getText());
		editor.undo();
		System.out.println();
		System.out.println(editor.getDocument().getText());
		
		//Template
		PartsMover mover = new Human();
		mover = new Robot();
		mover.move();
	}
}

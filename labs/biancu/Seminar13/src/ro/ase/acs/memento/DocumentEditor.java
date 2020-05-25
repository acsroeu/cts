package ro.ase.acs.memento;

public class DocumentEditor {
	private TextDocument document;
	private DocumentHistoryManager history =
			new DocumentHistoryManager();
	
	public DocumentEditor() {
		document = new TextDocument();
		document.setText("");
	}
	
	public TextDocument getDocument() {
		return document;
	}
	
	public void setDocument(TextDocument document) {
		this.document = document;
	}
	
	public void saveDocument() {
		try {
			TextDocument copy = (TextDocument)document.clone();
			history.addDocument(copy);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	
	public void undo() {
		document = history.getLastDocument();
	}
}

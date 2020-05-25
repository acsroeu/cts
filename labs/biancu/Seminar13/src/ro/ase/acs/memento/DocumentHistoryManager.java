package ro.ase.acs.memento;

import java.util.List;
import java.util.Vector;

public class DocumentHistoryManager {
	private List<TextDocument> documents = new Vector<>();
	
	public void addDocument(TextDocument doc) {
		documents.add(doc);
	}
	
	public TextDocument getLastDocument() {
		if(documents.size() > 0) {
			TextDocument doc = documents.get(documents.size() - 1);
			documents.remove(doc);
			return doc;
		}
		return null;
	}
}

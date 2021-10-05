package nru;

public class Page {

	int id;
	byte referenced;
	byte modified;
	byte present;
	int pageFrame;
	byte protection; 
	
	public Page(int id, byte referenced, byte modified, byte present, int pageFrame, byte protection){
		this.id = id;
		this.referenced = referenced;
		this.modified = modified;
		this.present = present;
		this.pageFrame = pageFrame;
		this.protection = protection;
	}
}

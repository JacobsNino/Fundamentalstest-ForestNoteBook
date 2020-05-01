package be.intec.brussel.the_notebook.plant_entities;

public class Bush extends Plant{
	private String fruit;
	private LeafType leafType;
	
	public Bush(String name) {
		super(name);
	}
	public Bush(String name, double height) {
		super(name,height);
	}
	
	public String getFruit() {
		return this.fruit;
	}
	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
	public LeafType getLeafType() {
		return this.leafType;
	}
	public void setLeafType(LeafType leafType) {
		this.leafType = leafType;
	}
	@Override
	public String toString() {
		return "Bush [fruit=" + fruit + ", leafType=" + leafType + "]";
	}
	

}

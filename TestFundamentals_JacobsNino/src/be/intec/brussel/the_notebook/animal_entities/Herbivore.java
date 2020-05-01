package be.intec.brussel.the_notebook.animal_entities;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import be.intec.brussel.the_notebook.plant_entities.Plant;
public class Herbivore extends Animal {
     Set<Plant> plantDiet = new HashSet<Plant>(Arrays.asList());;
	
	
	public Herbivore(String name) {
		super(name);
	}

	public Herbivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
		
	}
	public Set<Plant> getPlantDiet(){
		return this.plantDiet;
	}
	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}
	public void addPlantToDiet(Plant plant) {
		this.plantDiet.add(plant);
	}
	public void printDiet() {
		for(Plant p : plantDiet) {
			System.out.println(p);
		}
	}

	@Override
	public String toString() {
		return "Herbivore [plantDiet=" + plantDiet + "]";
	}
	
	

}

package be.intec.brussel.the_notebook.animal_entities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import be.intec.brussel.the_notebook.plant_entities.Plant;

public class Omnivore extends Animal {
	private Set<Plant> plantDiet =  new HashSet<Plant>(Arrays.asList());
	private double maxFoodSize;

	public Omnivore(String name) {
		super(name);
	}

	public Omnivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
	}
	
	public Set<Plant> getPlantDiet(){
		return this.plantDiet;
	}
	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}
	public double getMaxFoodSize() {
		return this.maxFoodSize;
	}
	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}
	public void addPlantToDiet(Plant plant) {
		this.plantDiet.add(plant);
	}

	@Override
	public String toString() {
		return "Omnivore [plantDiet=" + plantDiet + ", maxFoodSize=" + maxFoodSize + "]";
	}
	
}

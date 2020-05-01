package be.intec.brussel.the_notebook.service;

import java.util.ArrayList;
import java.util.List;

import be.intec.brussel.the_notebook.animal_entities.Animal;
import be.intec.brussel.the_notebook.animal_entities.Carnivore;
import be.intec.brussel.the_notebook.animal_entities.Herbivore;
import be.intec.brussel.the_notebook.animal_entities.Omnivore;
import be.intec.brussel.the_notebook.plant_entities.Plant;

public class Forestnotebook {
	private List<Carnivore> carnivores = new ArrayList<Carnivore>();
	private List<Omnivore> omnivores = new ArrayList<Omnivore>();
	private List<Herbivore> herbivores = new ArrayList<Herbivore>();
	private int plantCount;
	private int animalCount;
	private List<Animal> animals = new ArrayList<Animal>();
	private List<Plant> plants = new ArrayList<Plant>();

	public Forestnotebook() {

	}

	public List<Carnivore> getCarnivore() {
		return this.carnivores;
	}

	public void setCarnivores(List<Carnivore> carnivores) {
		this.carnivores = carnivores;
	}

	public List<Omnivore> getOmnivores() {
		return this.omnivores;
	}

	public void setOmnivores(List<Omnivore> omnivores) {
		this.omnivores = omnivores;
	}

	public List<Herbivore> getHerbivore() {
		return this.herbivores;
	}

	public void setHerbivores(List<Herbivore> herbivores) {
		this.herbivores = herbivores;
	}

	public int getPlantCount() {
		return this.plantCount;
	}

	public int getAnimalCount() {
		return this.animalCount;
	}

	public void addAnimal(Animal animal) {
		if (animals.size() == 0) {
			this.animals.add(animal);
			this.animalCount++;
			Herbivore herbivore;
			Omnivore omnivore;
			Carnivore carnivore;
			try {
				herbivore = (Herbivore) animal;
			} catch (Exception e) {
				// block of code to handle errors
				herbivore = null;
			}
			try {
				omnivore = (Omnivore) animal;
			} catch (Exception e) {
				// block of code to handle errors
				omnivore = null;
			}
			try {
				carnivore = (Carnivore) animal;
			} catch (Exception e) {
				// block of code to handle errors
				carnivore = null;
			}

			if (herbivore != null) {
				this.herbivores.add(herbivore);
			} else if (omnivore != null) {
				this.omnivores.add(omnivore);
			} else if (carnivore != null) {
				this.carnivores.add(carnivore);

			}

		} else {

			for (int i = 0; i <= animals.size(); i++) {
				if (animals.get(i).getName().equals(animal.getName())) {
					System.out.println("The Animal" + animal.getName() + "already exists in this list");
				} else {
					this.animals.add(animal);
					this.animalCount++;
					Herbivore herbivore;
					Omnivore omnivore;
					Carnivore carnivore;
					try {
						herbivore = (Herbivore) animal;
					} catch (Exception e) {
						// block of code to handle errors
						herbivore = null;
					}
					try {
						omnivore = (Omnivore) animal;
					} catch (Exception e) {
						// block of code to handle errors
						omnivore = null;
					}
					try {
						carnivore = (Carnivore) animal;
					} catch (Exception e) {
						// block of code to handle errors
						carnivore = null;
					}

					if (herbivore != null) {
						this.herbivores.add(herbivore);
					} else if (omnivore != null) {
						this.omnivores.add(omnivore);
					} else if (carnivore != null) {
						this.carnivores.add(carnivore);

					}

//				
					System.out.println(" You're animal has been added to the List");
					break;
				}
			}
		}

	}

	public void addPlant(Plant plant) {
		if (plants.size() == 0) {
			this.plants.add(plant);
			this.plantCount++;
//			System.out.println("first plant added");
//			System.out.println(plantCount);
		} else {
//			System.out.println("more then 1 plant in list");
			for (int i = 0; i < plants.size(); i++) {
//				System.out.println("plantsSize : " + plants.size());
//				System.out.println(
//						"iterated plants name " + plants.get(i).getName() + ", input plants name" + plant.getName());
//				System.out.println("iterated plant name equals input plant name gives :"
//						+ plants.get(i).getName().equals(plant.getName()));
				if (plants.get(i).getName().equals(plant.getName())) {
//					System.out.println("The Plant" + plant.getName() + "already exists in this list");
				} else {
					this.plants.add(plant);
					this.plantCount++;
					System.out.println("You're plant has been added to the List");
					break;

				}
			}
		}
	}

	public void printNotebook() {
		for (Plant plant : plants) {
			System.out.println(plant.getName());
		}
		for (Animal animal : animals) {
			System.out.println(animal.getName());
		}
	}

	public void sortAnimalsByName() {
		String temp;
		String str[] = new String[animals.size()];
		for (int i = 0; i < animals.size(); i++) {
			str[i] = animals.get(i).getName();
		}
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
//		for(String s : str) {
//			System.out.println(s);
//		}
		List<Animal> sortedAnimals = new ArrayList<Animal>();
//		for(int i = 0; i < str.length; i++) {
//			sortedAnimals.add(str[i]);
//		}
			
			
		for (int i = 0; i < str.length; i++) {
//			System.out.println("str[i] " + str[i]);
			for (int j = 0; j < str.length; j++) {
				if (str[i].equals(animals.get(j).getName())) {
//					System.out.println("str[i] " + str[i]);
//					System.out.println("animals name "  + animals.get(j).getName());
					sortedAnimals.add(animals.get(j));

				}
			}

		}
//		for(Animal animal : sortedAnimals) {
//			System.out.println(animal.getName());
//		}
		this.animals = sortedAnimals;
//		for(Animal s : this.animals) {
//			System.out.println(s.getName());
//		}
		

	}
//Capital comes before lowercase
	public void sortPlantsByName() {
		String temp;
		String str[] = new String[plants.size()];
		for (int i = 0; i < plants.size(); i++) {
			str[i] = plants.get(i).getName();
		}
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
//		for(String s : str) {		
//		System.out.println(s);
//	}
		List<Plant> sortedPlants = new ArrayList<Plant>();
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if (str[i].equals(plants.get(j).getName())) {
					sortedPlants.add(plants.get(j));

				}
			}

		}
		this.plants = sortedPlants;
	}

}

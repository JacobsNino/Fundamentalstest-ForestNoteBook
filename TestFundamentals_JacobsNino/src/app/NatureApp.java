package app;


import java.util.Arrays;
import java.util.HashSet;

import be.intec.brussel.the_notebook.animal_entities.*;
import be.intec.brussel.the_notebook.plant_entities.*;
import be.intec.brussel.the_notebook.service.Forestnotebook;

public class NatureApp {

	public static void main(String[] args) {
		Forestnotebook noteBook = new Forestnotebook();
		
		 
		Tree ogTree = new Tree("Oak",135);
		ogTree.setLeafType(LeafType.HAND);
		noteBook.addPlant(ogTree);
		
		Weed ogWeed = new Weed("Dandelion",5);
		ogWeed.setArea(10);
		noteBook.addPlant(ogWeed);
		
		Flower ogFlower = new Flower("Rose",10);
		ogFlower.setSmell(Scent.PINEAPPLE);
		noteBook.addPlant(ogFlower);
		
		
		Bush gwBush = new Bush("GeorgeW",1.5);
		gwBush.setFruit("Sour Berry");
		gwBush.setLeafType(LeafType.HEART);
		noteBook.addPlant(gwBush);
		
		Tree seeTreePO = new Tree("Goldentree",200);
		seeTreePO.setLeafType(LeafType.SPEAR);
		noteBook.addPlant(seeTreePO);
		
		
		
		
		
		
//	--------------------------------------------------------------
		
		Carnivore c1 = new Carnivore("Thepredator",200,350,400);
		 c1.setMaxFoodSize(Double.MAX_VALUE);
		 noteBook.addAnimal(c1);
		 
		
		Carnivore c2 = new Carnivore("TomCat",100,250,300);
		c2.setMaxFoodSize(100);
		noteBook.addAnimal(c2);
		
		Carnivore c3 = new Carnivore("Kermit",150,300,250);
		c3.setMaxFoodSize(150);
		noteBook.addAnimal(c3);
		
		
		Omnivore o1 = new Omnivore("Chicken",5,30,25);
		o1.setMaxFoodSize(20);
		o1.setPlantDiet(new HashSet<Plant>(Arrays.asList(seeTreePO)));
		noteBook.addAnimal(o1);
		
		
		Omnivore o2 = new Omnivore("Seagull",10,25,17);
		o2.setMaxFoodSize(15);
		o2.setPlantDiet(new HashSet<Plant>(Arrays.asList(gwBush)));
		noteBook.addAnimal(o2);
		
		
		Omnivore o3 = new Omnivore("Crow",15,20,19);
		o3.setMaxFoodSize(21);
		o3.setPlantDiet(new HashSet<Plant>(Arrays.asList(ogWeed)));
		noteBook.addAnimal(o3);
		
		
		
		
		Herbivore h1 = new Herbivore("Horse",200,150,500);
		h1.setPlantDiet(new HashSet<Plant>(Arrays.asList(gwBush,ogFlower)));
		noteBook.addAnimal(h1);
		
		
		Herbivore h2 = new Herbivore("Gorilla",500,200,300);
		h2.setPlantDiet(new HashSet<Plant>(Arrays.asList(gwBush,ogTree)));
		noteBook.addAnimal(h2);
		
		
		Herbivore h3 = new Herbivore("Koala",100,90,60);
		h3.setPlantDiet(new HashSet<Plant>(Arrays.asList(seeTreePO,ogTree)));
		noteBook.addAnimal(h3);
		
		
//--------------------------------------------------------------------------------
		
		System.out.println("Amount of Plants : " + noteBook.getPlantCount());
		System.out.println("Amount of Animals : " + noteBook.getAnimalCount());
		
		
		System.out.println("----------------------------------------------------------");
		
		noteBook.printNotebook();
		
		System.out.println("----------------------------------------------------------");
		
		
		System.out.println(noteBook.getCarnivore());
		System.out.println(noteBook.getOmnivores());
		System.out.println(noteBook.getHerbivore());
		
		
		
		
		System.out.println("----------------------------------------------------------");
		
		
		noteBook.sortPlantsByName();
		noteBook.sortAnimalsByName();
		
		noteBook.printNotebook();
	
		
		
		
		
		
		
	
		
		
	
		
		
		
		
		
	
		 }
	}



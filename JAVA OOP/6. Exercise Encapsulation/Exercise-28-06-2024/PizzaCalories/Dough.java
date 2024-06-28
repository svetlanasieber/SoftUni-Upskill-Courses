package Pizza_Calories;

import java.util.Map;

public class Dough {
	private String flourType;
	private String bakingTechnique;
	private double weight;
	private static final Map<String, Double> VALID_TYPES_OF_DOUGH = Map.of("White", 1.5, "Wholegrain", 1.0);

	private static final Map<String, Double> VALID_TYPES_OF_BAKING_TECHNIQUE = Map.of("Crispy", 0.9, "Chewy", 1.1,
			"Homemade", 1.0);

	public Dough(String flourType, String bakingTechnique, double weight) {
		setFlourType(flourType);
		setBakingTechnique(bakingTechnique);
		setWeight(weight);
	}

	private void setFlourType(String flourType) {
		if (!VALID_TYPES_OF_DOUGH.containsKey(flourType)) {
			throw new IllegalArgumentException("Invalid type of dough.");
		}
		this.flourType = flourType;
	}

	private void setBakingTechnique(String bakingTechnique) {
		if (!VALID_TYPES_OF_BAKING_TECHNIQUE.containsKey(bakingTechnique)) {
			throw new IllegalArgumentException("Invalid type of dough.");
		}
		this.bakingTechnique = bakingTechnique;
	}

	private void setWeight(double weight) {
		if (weight < 0 || weight > 200) {
			throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
		}
		this.weight = weight;
	}

	public double calculateCalories() {
		double flourCalories = VALID_TYPES_OF_DOUGH.get(flourType);
		double bakingTechniqueCalories = VALID_TYPES_OF_BAKING_TECHNIQUE.get(bakingTechnique);
		double calories = weight * 2 * flourCalories * bakingTechniqueCalories;
		return calories;

	}

}

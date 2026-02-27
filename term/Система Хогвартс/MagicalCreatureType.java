import java.util.Scanner;

public class MagicalCreatureType extends Wizard {
	private String creatureType;

	public MagicalCreatureType(String name, int mana, int age, int spellPower, String creatureType) {
		super(name, mana, age, spellPower);
		setCreatureType(creatureType);
	}

	public String getCreatureType() {
		return creatureType;
	}
	public void setCreatureType() {
		this.creatureType = creatureType;
	}

	public void speccialAbility(Wizard target) {
		target.setMana(target.getMana() - spellPower)
		target.setSpellPower(target.getSpellPower() + spellPower/2);
	}
	public void speccialAbility() {
		System.out.println("Смотри как могу");
		setMana(getMana() - 5);
	}
}
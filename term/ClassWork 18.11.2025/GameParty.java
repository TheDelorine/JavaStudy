public class GameParty {
	private final int partyMembersCount = 5;
	public GameCharacter[] partyMembers = new GameCharacter[partyMembersCount];
	public int characters_int = 0;

	public void addCharacter(GameCharacter character) {
		if (characters_int < 5) {
			partyMembers[characters_int] = character;
			characters_int++;
		} else {
			System.out.println("Достигнуто максимальное количество членов отряда.");
		}
	}

	public void removeCharacter(String name) {
		if (characters_int == 0) {
			return;
		}
		boolean a = false;
		int foundIndex = 0;
		for (int i = 0; i < characters_int; i++) {
			if (partyMembers[i].getName().equals(name) == true && a == false) {
				a = true;
				foundIndex = i;
			}
		}
		if (a) {
			for (int i = foundIndex; i < characters_int - 1; i++) {
				partyMembers[i] = partyMembers[i + 1];
			}
			partyMembers[characters_int - 1] = null;
			characters_int--;
		} else {
			System.out.println("Данный персонаж не найден!");
		}
	}

	public String displayPartyInfo() {
		if (characters_int == 0) {
			return "";
		}
		for (int i = 0; i < characters_int; i++) {
			System.out.println(partyMembers[i].displayInfo());
		}
	}

	public void useAllSpecialAbilities() {
		if (characters_int == 0) {
			return;
		}
		for (int i = 0; i < characters_int; i++) {
			System.out.println(partyMembers[i].useSpecialAbility());
		}
	}

	public void findCharactersByClass(String className) {
		if (characters_int == 0) {
			return;
		}
		for (int i = 0; i < characters_int; i++) {
			if (partyMembers[i] instanceof Warrior) {
				System.out.println(partyMembers[i].displayInfo());
			} else if (partyMembers[i] instanceof Wizard) {
				System.out.println(partyMembers[i].displayInfo());
			} else if (partyMembers[i] instanceof Archer) {
				System.out.println(partyMembers[i].displayInfo());
			}
		}
	}

	public int calculatePartyPower() {
		if (characters_int == 0) {
			return 0;
		}
		int res = 0;
		for (i = 0; i < characters_int; i++) {
			res += partyMembers[i].getPower(); 
		}
		return res;
	}
}
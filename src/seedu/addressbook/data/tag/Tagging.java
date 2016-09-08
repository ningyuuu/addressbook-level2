package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
	
	private String plusSign = "+ ";
	private String minusSign = "- ";
	
	
	private Person taggedPerson;
	private Tag tagObject;
	private boolean shouldAdd;
	
	public Tagging(Person person, Tag tag, boolean add) {
		this.taggedPerson = person;
		this.tagObject = tag;
		this.shouldAdd = add;
	}

	@Override
	public String toString() {
		if (shouldAdd) {
			return plusSign + taggedPerson + " " + tagObject;
		} else {
			return minusSign + taggedPerson + " " + tagObject;
		}
	}	
}

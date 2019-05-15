package com.revature.beans;

public class Food {
	private String name;
	private int taste;
	private int spiciness;
	private Dish dish;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTaste() {
		return taste;
	}

	public void setTaste(int taste) {
		this.taste = taste;
	}

	public int getSpiciness() {
		return spiciness;
	}

	public void setSpiciness(int spiciness) {
		this.spiciness = spiciness;
	}

	public Dish getDish() {
		return dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", taste=" + taste + ", spiciness=" + spiciness + ", dish=" + dish + "]";
	}

	public Food(String name, int taste, int spiciness, Dish dish) {
		super();
		this.name = name;
		this.taste = taste;
		this.spiciness = spiciness;
		this.dish = dish;
	}

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dish == null) ? 0 : dish.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + spiciness;
		result = prime * result + taste;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		if (dish == null) {
			if (other.dish != null)
				return false;
		} else if (!dish.equals(other.dish))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (spiciness != other.spiciness)
			return false;
		if (taste != other.taste)
			return false;
		return true;
	}

}

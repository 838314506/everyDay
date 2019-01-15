package collection.list;

public class User {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null)? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		User other = (User)obj;
		if(name == null) {
			if(other.name != null)
				return false;
		}else if
		(!name.equals(other.name))
			return false;
		
		if(age == other.age) {
			return true;
		}
		return super.equals(obj);
	}
	public User() {}
	public User(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public String name;
	
	public int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
}

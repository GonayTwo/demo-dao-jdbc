package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Integer id;
	
	
	public Department(String name, Integer id) {
		this.name = name;
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public Integer getId() {
		return id;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id);
	}


	@Override
	public String toString() {
		return "Department [name=" + name + ", id=" + id + "]";
	}

}
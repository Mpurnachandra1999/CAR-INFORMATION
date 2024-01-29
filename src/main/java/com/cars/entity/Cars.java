package com.cars.entity;

/*import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.Table;*/

@Entity
//@Table(value="car")
public class Cars {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	//@Column("name")
	private String name;
	
	//@Column("model")
	private String model;
	
	//@Column("color")
	private String color;
	
	//@Column("steering_type")
	private String SteeringType;
	
	//@Column("engine_type")
	private String engineType;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	} 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSteeringType() {
		return SteeringType;
	}
	public void setSteeringType(String steeringType) {
		SteeringType = steeringType;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	} 
}

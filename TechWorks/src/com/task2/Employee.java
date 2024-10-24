package com.task2;
import java.util.*;
public class Employee {

		private int id;
		private String name;
		private int workinghours;
		private int hourlywage;
		public Employee() {}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getWorkinghours() {
			return workinghours;
		}
		public void setWorkinghours(int workinghours) {
			this.workinghours = workinghours;
		}
		public int getHourlywage() {
			return hourlywage;
		}
		public void setHourlywage(int hourlywage) {
			this.hourlywage = hourlywage;
		}
		public Employee(int id, String name, int workinghours, int hourlywage) {
			super();
			this.id = id;
			this.name = name;
			this.workinghours = workinghours;
			this.hourlywage = hourlywage;
		}
		
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", workinghours=" + workinghours + ", hourlywage="
					+ hourlywage + "]";
		}
		
		

}

package c2tc.m07.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Customer
{
	@Id
	private int id;
	private String name;
	@Temporal(TemporalType.DATE)
	private Date Manufactring;
	private Date Expiry;
	private float price;
	private Category category;
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
	public Date getManufactring() {
		return Manufactring;
	}
	public void setManufactring(Date manufactring) {
		Manufactring = manufactring;
	}
	public Date getExpiry() {
		return Expiry;
	}
	public void setExpiry(Date expiry) {
		Expiry = expiry;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + ", Manufactring=" + Manufactring + ", Expiry=" + Expiry
				+ ", price=" + price + ", category=" + category + "]";
	}
	
}

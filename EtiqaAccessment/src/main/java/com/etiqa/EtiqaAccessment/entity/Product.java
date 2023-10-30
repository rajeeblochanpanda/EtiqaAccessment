package com.etiqa.EtiqaAccessment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Product")
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4046947650174693438L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="Book_Title")
	private String bookTitle;
	@Column(name="Book_Price")
	private String bookPrice;
	@Column(name="Book_Quantity")
	private String bookQuantity;
	@Column(name="Book_Auther")
	private String bookAuther;
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookQuantity() {
		return bookQuantity;
	}
	public void setBookQuantity(String bookQuantity) {
		this.bookQuantity = bookQuantity;
	}
	public String getBookAuther() {
		return bookAuther;
	}
	public void setBookAuther(String bookAuther) {
		this.bookAuther = bookAuther;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", bookTitle=" + bookTitle + ", bookPrice=" + bookPrice + ", bookQuantity="
				+ bookQuantity + ", bookAuther=" + bookAuther + ", getBookTitle()=" + getBookTitle()
				+ ", getBookPrice()=" + getBookPrice() + ", getBookQuantity()=" + getBookQuantity()
				+ ", getBookAuther()=" + getBookAuther() + ", getId()=" + getId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}

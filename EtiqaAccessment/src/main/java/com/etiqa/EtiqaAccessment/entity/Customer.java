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
@Table(name = "Customer")
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer extends BaseEntity{
	private static final long serialVersionUID = 1078941591460955840L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="first_Name")
	private String firstName;
	@Column(name="last_Name")
	private String lastName;
	@Column(name="personal_Email")
	private String personalEmail;
	@Column(name="office_Email")
	private String officeEmail;
	@Column(name="family_Members")
	private int familyMembers;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPersonalEmail() {
		return personalEmail;
	}
	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}
	public String getOfficeEmail() {
		return officeEmail;
	}
	public void setOfficeEmail(String officeEmail) {
		this.officeEmail = officeEmail;
	}
	public int getFamilyMembers() {
		return familyMembers;
	}
	public void setFamilyMembers(int familyMembers) {
		this.familyMembers = familyMembers;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", personalEmail="
				+ personalEmail + ", officeEmail=" + officeEmail + ", familyMembers=" + familyMembers
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getPersonalEmail()="
				+ getPersonalEmail() + ", getOfficeEmail()=" + getOfficeEmail() + ", getFamilyMembers()="
				+ getFamilyMembers() + ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

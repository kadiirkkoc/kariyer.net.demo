package kariyer.net.demo.kariyer.net.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@Entity
@Table(name="employers")
public class Employers extends User{
	
	@Column(name="company_name",nullable = false)
	private String companyName;
	
	@Column(name="web_site",nullable = false)
	private String webSite;
	
	@Column(name="phone_number",nullable = false)
	private String phoneNumber;

	private Employers(String companyName, String webSite, String phoneNumber) {
		super();
		this.companyName = companyName;
		this.webSite = webSite;
		this.phoneNumber = phoneNumber;
	}
	
	

}

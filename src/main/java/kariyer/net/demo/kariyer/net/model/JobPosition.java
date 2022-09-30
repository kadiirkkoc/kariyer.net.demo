package kariyer.net.demo.kariyer.net.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@Entity
@Table(name="job_positions")
public class JobPosition {
	
	public JobPosition(String position_Name) {
		this.position_Name=position_Name;
	}
	
	@Column(name="job_position_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	
	@Column(name ="position_name")
	private String position_Name;
	
	@OneToMany(mappedBy="job_position")
	@Cascade(CascadeType.ALL)
	private List<User>users;
	
	
}

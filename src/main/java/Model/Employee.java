package Model;

import java.math.BigInteger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
   
	@Id
	private BigInteger id;
	private String name;
	private BigInteger salary;
	private String grade;
        private BigInteger totalBonus;
        
    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getSalary() {
        return salary;
    }

    public void setSalary(BigInteger salary) {
        this.salary = salary;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    public BigInteger getTotalBonus() {
        return totalBonus;
    }

    public void setTotalBonus(BigInteger totalBonus) {
        
        this.totalBonus = totalBonus;
    }

   
        
}

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
        
        String salaryString = this.salary != null ? this.salary.toString():"0";
        int bonus = 0;
        if("1".equalsIgnoreCase(this.grade))
        {
           bonus =  Integer.parseInt(salaryString) + (Integer.parseInt(salaryString) * 10/100);
        }
        else if("2".equalsIgnoreCase(this.grade)){
           bonus =  Integer.parseInt(salaryString) + (Integer.parseInt(salaryString) * 6/100); 
        }
        else if("3".equalsIgnoreCase(this.grade)){
           bonus =  Integer.parseInt(salaryString) + (Integer.parseInt(salaryString) * 3/100); 
        }
       
        String bonusFinal = "" + bonus;
        totalBonus = new BigInteger(bonusFinal);
            
        return totalBonus;
    }

    public void setTotalBonus(BigInteger totalBonus) {
        this.totalBonus = totalBonus;
    }

        
        
}

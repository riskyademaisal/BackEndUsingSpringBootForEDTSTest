package config;

import Controller.Controller;
import Model.Employee;
import Service.Emlpoyee_Service;
import static com.mysql.cj.exceptions.MysqlErrorNumbers.get;
import java.util.List;
import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeApplicationTests {
    
        @Autowired
        private Emlpoyee_Service employeeservice;
        
        @Autowired
        private MockMvc mockMvc;
         
	@Test
	public void contextLoads() {
	}
        
        @Test
	public void allEmployees() throws Exception {
	
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/api/employees-list")
        .contentType(MediaType.APPLICATION_JSON)
        .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andReturn();

        String resultDOW = result.getResponse().getContentAsString();
        System.out.print(resultDOW);
        assertNotNull(resultDOW);
	}

}

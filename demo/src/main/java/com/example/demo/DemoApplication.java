package com.example.demo;
import com.example.demo.repository.employeeRepository;
import com.example.demo.model.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    private employeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception{
        Employee employee = new Employee();
        employee.setFirstName("Vishal");
        employee.setLastName("Narendra");
        employee.setEmailId("vishalnarendra346@gmail.com");
        employeeRepository.save(employee);

        Employee employee1 = new Employee();
        employee1.setFirstName("Hrithik");
        employee1.setLastName("Narendra");
        employee1.setEmailId("hrithiknarendra346@gmail.com");
        employeeRepository.save(employee1);
    }

}

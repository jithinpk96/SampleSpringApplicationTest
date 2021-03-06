package com.kg.sampll;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
* EmployeeController
*/
@RestController

@RequestMapping(value = "/employees")
public class EmployeeController {

   @Autowired
   private EmployeeRepository employeeRepository;

   // @RequestMapping(value = "/")
   // public Iterable<Employee> sample() {
   // return employeeRepository.findByDepartmentAndSalaryLessThan("DEPARTMENT6",
   // 5000L);

   // }
   @RequestMapping(method = RequestMethod.GET)
   public Iterable<Employee> read() {
       return employeeRepository.findAll();
   }

   @RequestMapping(value = "/{employeeId}", method = RequestMethod.GET, produces = { ("application/json") })
   public Optional<Employee> readOne(@PathVariable Long employeeId) {
       System.out.println(employeeRepository.findById(employeeId));
       return employeeRepository.findById(employeeId);
   }

   // @RequestMapping(method = RequestMethod.POST)
   // public Employee add(@RequestBody Employee Employee) {
   //     Employee.setEmployeeId(null);
   //   return employeeRepository.saveAndFlush(Employee);
   // }

   @RequestMapping(method = RequestMethod.POST)
  public Employee add(@RequestBody Employee employee) {
      employee.setEmployeeId(null);
      return employeeRepository.saveAndFlush(employee);
  }

   @RequestMapping(value="/{id}",method=RequestMethod.PUT)
   public Employee update(@PathVariable Long id,@RequestBody Employee updateEmployee )
   {
        updateEmployee.setEmployeeId(id);
        return employeeRepository.saveAndFlush(updateEmployee);
   }
   @RequestMapping(value="/{id}",method=RequestMethod.DELETE)
   public void  deleteemployee(@PathVariable Long id)
   {
         employeeRepository.deleteById(id);
   }

   
   
 


}
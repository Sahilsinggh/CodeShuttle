package com.codingshuttle.springbootwebtutorial.springbootwebtutorial.controllers;

import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.dto.EmployeeDTO;
import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.entities.EmployeeEntity;
import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @GetMapping("/{employeeId}")
    public EmployeeEntity getEmployeeById(@PathVariable(name = "employeeId") Long id){
    //return new EmployeeDTO(id, "Sahil","24","sahil@gmail.com", LocalDate.of(2024,9,16),true);
        return employeeRepository.findById(id).orElse(null);
}
@GetMapping
public List<EmployeeEntity> getAllEmployees(@RequestParam(required = false, name = "intAge") Integer age,
                                            @RequestParam(required = false) String sortBy){
    //return "Hi age "+ age + sortBy;
    return employeeRepository.findAll();
}

    /**
     * this postcall will convert json to DTo object , then from DTo back to json object
     * @param
     * @return
     */
    @PostMapping
    public EmployeeEntity createNewEmployee(@RequestBody EmployeeEntity employeeEntity){

    return employeeRepository.save(employeeEntity);
}


}

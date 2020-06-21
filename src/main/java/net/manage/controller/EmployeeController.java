package net.manage.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
    
    @Autowired
    EmployeeService service;
    
    @RequestMapping("/")
    public ModelAndView homePage()
    {
        ModelAndView mav=new ModelAndView("index");
        List<Employee> allEmp=service.showAllEmployee();
        mav.addObject("allEmpList", allEmp);
        return mav;
    }
    
    
    @RequestMapping("/newemployee")
    public String openNewEmployeeForm()
    {
        return "employeeForm"; 
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/saveEmployee")
    public String saveNewEmployeeForm(@ModelAttribute("employee") Employee employee)
    {
        
       service.saveEmployee(employee);
       return "redirect:/"; 
    }
    
    @RequestMapping("/edit")
    public ModelAndView editEmployee(@RequestParam long id)
    {
        ModelAndView mav=new ModelAndView("editForm");
        Employee emp=service.findEmployee(id);
        mav.addObject("employee", emp);
        return mav;
    }
    
    @RequestMapping("/delete")
    public String deleteEmployee(@RequestParam long id)
    {
        service.deleteEmployee(id);
        return "redirect:/";
    }
    
    @RequestMapping("/search")
    public ModelAndView searchEmployee(@RequestParam String keyword)
    {
        ModelAndView mav=new ModelAndView("searchPage");
        List<Employee> emp=service.searchEmployee(keyword);
        mav.addObject("searchResult", emp);
        return mav;
    }

    
}

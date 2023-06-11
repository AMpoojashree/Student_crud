package mvc.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jdk.nashorn.internal.ir.RuntimeNode.Request;
import mvc.dto.Student;
import mvc.service.StudentService;

@Controller
public class StudentController 
{
//    @RequestMapping(name="save",method=RequestMethod.POST) it is a generic,it will accept both get and post method
	
	@Autowired //it will go to studentservice and get object
	StudentService service;
	
	
//	@PostMapping("Save")
//	@ResponseBody
//	public String save(@ModelAttribute Student student,@RequestParam String date){
//	//instead of recieving one by one data by fronted ModelAttribute receive directly//
//	    student.setDob(Date.valueOf(date));
//		return student.toString();
//	}
	//we given post for form that why we taken postmapping
	@PostMapping("save")
	public ModelAndView save(@ModelAttribute Student student,@RequestParam String date){
	  
		return service.save(student, date);
		//sending to service bynPASS BY REFERENCE to StudentServices
	}
	
	@GetMapping("fetchall")
	public ModelAndView fetchAll(){
		return service.fetchAll();
	}
	
	@PostMapping("fetchbyname")
	public ModelAndView fetchByName(@RequestParam String name){
		  //to receive value from fronted we use Requestparam //
		return service.fetchByName(name);
	}
	@GetMapping("delete")
	public ModelAndView delete(@RequestParam int id)
	{
		return service.delete(id);
	}
	
	@GetMapping("edit")
	public ModelAndView edit(@RequestParam int id)
	{
		return service.edit(id);
	}
	
	@PostMapping("update")
	public ModelAndView update(@ModelAttribute Student student,@RequestParam String date)
	{
		return service.update(student,date);
	}
}

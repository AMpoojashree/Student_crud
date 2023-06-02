package mvc.controller;

import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import mvc.dto.Student;

@Controller
public class StudentController 
{
//    @RequestMapping(name="save",method=RequestMethod.POST) it is a generic,it will accept both get and post method
	@PostMapping("Save")
	@ResponseBody
	public String save(@ModelAttribute Student student,@RequestParam String date){
	//instead of recieving one by one data by fronted ModelAttribute receive directly//
	    student.setDob(Date.valueOf(date));
		return student.toString();
	}
}

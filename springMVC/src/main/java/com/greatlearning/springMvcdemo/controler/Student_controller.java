package com.greatlearning.springMvcdemo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.greatlearning.springMvcdemo.Student;

@Controller
@RequestMapping("/Student")
public class Student_controller {

	@RequestMapping(value="/hallowForm", method=RequestMethod.GET)
	public String ShowStudentDetails(Model theModel1) {
		
		// Creating The Object of the Student:-
		Student student=new Student();
		theModel1.addAttribute("student", student);
		return "Student-Form";
	}
	
	@RequestMapping("/prossess")
	public String prossesFrom(@ModelAttribute("student") Student theStudent) {
		System.out.println("The Student "+theStudent.getFirst_Name());
		System.out.println("The Student "+theStudent.getLast_Name());
		System.out.println("The Student "+theStudent.getCountries());
		System.out.println("The Student "+theStudent.getFavorietLanguage());
		System.out.println("The Student "+theStudent.getFavorietLanguage());
		System.out.println("The Student "+theStudent.getOperetionSystem());
	
		return "Student-ConforMetion";
		
		
	}

}

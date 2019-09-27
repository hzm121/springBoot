package com.hzm.ch7;

import com.hzm.ch7.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@SpringBootApplication
public class Ch7Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch7Application.class, args);
    }
    @RequestMapping("/")
    public String index(Model model){
        Person singel = new Person("aa",11);
        List<Person> personList = new ArrayList<Person>();
        Person p1 = new Person("xx",11);
        Person p2 = new Person("yy",22);
        Person p3 = new Person("zz",33);
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        model.addAttribute("singlePerson",singel);
        model.addAttribute("peopleList",personList);
        return "index";
    }
}

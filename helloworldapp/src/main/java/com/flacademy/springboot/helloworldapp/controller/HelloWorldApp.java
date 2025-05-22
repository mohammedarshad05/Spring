package com.flacademy.springboot.helloworldapp.controller;

import com.flacademy.springboot.helloworldapp.model.Course;
import com.flacademy.springboot.helloworldapp.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloWorldApp {

@GetMapping("/greet")
public String greet(){
    return "Hello World!";
}

@GetMapping("/courses")
    public List<Course>getCourses(){
    Course course1 = new Course(1,"Rect","Frontend Dev using React",45);
    Course course2 = new Course(2,"Spring Boot","Backend Dev using java and spring boot ",55);
    Course course3 = new Course(3,"web Design", "web design using html css bootstrap",60);

    ArrayList<Course> courses = new ArrayList<>();
    courses.add(course1);
    courses.add(course2);
    courses.add(course3);

    return courses;
}

@GetMapping("/products")
    public  List<Product>getProducts(){
    Product product1 = new Product(1,"smartphone",699.9,"samsung","electronics");
    Product product2 = new Product(2,"shoes",1299.9,"nike","footwear");
    Product product3 = new Product(3,"laptop",1099.9,"dell","computers");


    ArrayList<Product> products = new ArrayList<>();
    products.add(product1);
    products.add(product2);
    products.add(product3);
    return products;

}
}

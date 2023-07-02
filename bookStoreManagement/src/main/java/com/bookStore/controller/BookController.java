package com.bookStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.bookStore.entity.bookAdminlogin;
import com.bookStore.entity.bookuserRegister;

@Controller
public class BookController {
@GetMapping("/")
public String home() {
	return "home";
}
@GetMapping("/book_register")
public String bookRegister() {
	return "bookRegister";
}
@GetMapping("/available_books")
public String getAllBook() {
	return "bookList";
	}

@GetMapping("/my_books")
public String getMyBooks() {
	return "myBooks";
}
@RequestMapping("/editBook/{id}")
public String editBook() {
	return "bookEdit";
}
@GetMapping("/log_user")
public String getuserLog() {
	return "login";
}
@PostMapping("/login_user")
public String getuserLogin(@ModelAttribute bookAdminlogin b) {
	System.out.println(b);
	return "home";
	}
@GetMapping("/regi_user")
public String getuserRegi() {
	System.out.println("Successfully Added");
	return "register";
}
@PostMapping("/register_user")
public String getuserRegister(@ModelAttribute bookuserRegister r) {
	System.out.println(r);
	return "login";
	}
}

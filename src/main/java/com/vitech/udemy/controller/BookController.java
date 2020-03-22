package com.vitech.udemy.controller;

import com.vitech.udemy.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class BookController {

  private final BookRepository bookRepository;

  @RequestMapping("/books")
  private String getBooks(Model model){

    model.addAttribute("books", bookRepository.findAll());
    return "books/list";
  }
}

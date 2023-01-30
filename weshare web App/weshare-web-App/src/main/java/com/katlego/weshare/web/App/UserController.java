package com.katlego.weshare.web.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/expenses")
    public String ManageExpenses(Model model){
        model.addAttribute("expense", userService.find_all_expenses());
        return "/expenses";
    }
    @GetMapping("/form")
    public String Add_Student(Model model){
        model.addAttribute("expense",new UserEntity());

        return "form";
    }
    @PostMapping("add")
    public String save_user(UserEntity expense){
        userService.save_expense(expense);
        return "redirect:/expenses";
    }
    @GetMapping ("remove/{id}")
    public  String delete(@PathVariable(value="id") Long id)  {
        userService.delete_by_expense_id(id);
        return "redirect:/expenses";
    }
}

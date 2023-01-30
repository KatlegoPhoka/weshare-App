package com.katlego.weshare.web.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService implements UserInterface {
    @Autowired

   private UserRepository userRepository;

    @Override
    public ArrayList<UserEntity> find_all_expenses() {
        ArrayList<UserEntity> List_of_expenses;
        List_of_expenses = (ArrayList<UserEntity>) userRepository.findAll();

        return List_of_expenses;
    }

    @Override
    public void save_expense(UserEntity expense) {
        userRepository.save(expense);

    }

    @Override

    public void delete_by_expense_id(Long id) {
        userRepository.deleteById(id);
    }
}
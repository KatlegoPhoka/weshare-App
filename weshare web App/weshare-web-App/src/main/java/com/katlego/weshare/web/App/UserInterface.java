package com.katlego.weshare.web.App;

import java.util.ArrayList;

public interface UserInterface {
    ArrayList<UserEntity> find_all_expenses();

    void save_expense(UserEntity expense);

    void delete_by_expense_id(Long id);

}

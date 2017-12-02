package com.kars.mybot.service;

import com.kars.mybot.Enum.ResultEnum;
import com.kars.mybot.Form.LoginForm;

public interface LoginService {

    ResultEnum getLogin(LoginForm form);

}

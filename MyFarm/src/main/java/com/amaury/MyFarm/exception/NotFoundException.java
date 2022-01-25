package com.amaury.MyFarm.exception;

import static com.amaury.MyFarm.constants.Constants.NOT_FOUND_EXCEPTION_MESSAGE;

public class NotFoundException extends Exception{

    @Override
    public String getMessage() {
        return NOT_FOUND_EXCEPTION_MESSAGE;
    }
}

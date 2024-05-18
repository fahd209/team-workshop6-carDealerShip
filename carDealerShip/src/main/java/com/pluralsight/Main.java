package com.pluralsight;

import com.pluralsight.Services.ContractFileManager;
import com.pluralsight.ui.UserInterface;

public class Main {
    public static void main(String[] args)
    {
        ContractFileManager.saveContract();
        UserInterface app = new UserInterface();
        app.run();
    }
}
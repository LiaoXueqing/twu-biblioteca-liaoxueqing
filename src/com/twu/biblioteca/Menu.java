package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private Map<Integer, String> memuOptions;

    public Menu() {
        memuOptions = new HashMap<Integer, String>(){
            {
                put(1, "List of books");
            }
        };
    }

    public int chooseMenu() {

        printInfo();
        int option = getInput();
        if(checkResult(option)) {
            return option;
        } else {
            System.out.println("Please select a valid option!");
            return 0;
        }

    }

    public void printInfo() {
        System.out.println("************************************");
        System.out.println();
        System.out.println("------ Please choose the menu ------");
        memuOptions.forEach((key, value) -> {
            System.out.println("         " + key +" : " + value);
        });
        System.out.println();
        System.out.println("************************************");
    }

    public boolean checkResult(int option) {
        if(memuOptions.keySet().contains(option)) {
            //choose right
            return true;
        } else {
            //choose error
            return false;
        }
    }

    public int getInput() {
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        return option;
    }

    public Map<Integer, String> getMemuOptions() {
        return memuOptions;
    }

    public void setMemuOptions(Map<Integer, String> memuOptions) {
        this.memuOptions = memuOptions;
    }
}

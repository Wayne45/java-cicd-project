package com.example.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class HelloWorldCommand {

    @ShellMethod("Say hello")
    public String hello(String name) {
        return "Hello, " + name + "!";
    }
}
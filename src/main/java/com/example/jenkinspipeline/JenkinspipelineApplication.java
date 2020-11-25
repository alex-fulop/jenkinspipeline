package com.example.jenkinspipeline;

import com.example.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinspipelineApplication {

    public static void main(String[] args)
    {
        HelloWorld helloWorld = new HelloWorld("What a nice day");
        helloWorld.getMessage();
    }

}

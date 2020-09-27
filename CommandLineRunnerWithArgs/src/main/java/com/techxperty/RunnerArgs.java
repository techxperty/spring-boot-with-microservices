package com.techxperty;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerArgs implements CommandLineRunner {
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(args[0]);
		String strArgs = Arrays.stream(args).
				collect(Collectors.joining("|"));
		System.out.println(strArgs);
	}
}

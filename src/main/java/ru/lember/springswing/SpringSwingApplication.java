package ru.lember.springswing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.lember.springswing.main.MainFrame;

import java.awt.*;

@SpringBootApplication
public class SpringSwingApplication {

	public static void main(String[] args) {
		SpringAppicationContext ctx = new SpringApplicationBuilder(MainFrame.class)
				.headless(false).run(args);

		EventQueue.invokeLater(() -> {

			MainFrame ex = ctx.getBean(MainFrame.class);
			ex.setVisible(true);
		});
	}

}

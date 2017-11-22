package com.ctrip.framework.apollo.demo.spring.springBootDemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.Scanner;

/**
 * @author Jason Song(song_s@ctrip.com)
 */
@SpringBootApplication(scanBasePackages = {"com.ctrip.framework.apollo.demo.spring.common",
    "com.ctrip.framework.apollo.demo.spring.springBootDemo"
})
public class SpringBootSampleApplication {

  public static void main(String[] args) {
    new SpringApplicationBuilder(SpringBootSampleApplication.class).run(args);
    onKeyExit();
  }

  private static void onKeyExit() {
    System.out.println("Press Enter to exit...");
    new Scanner(System.in).nextLine();
  }
}

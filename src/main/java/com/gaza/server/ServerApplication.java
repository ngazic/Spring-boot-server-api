package com.gaza.server;

import com.gaza.server.enumeration.Status;
import com.gaza.server.model.Server;
import com.gaza.server.repo.ServerRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@Slf4j
@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

    @Bean
    CommandLineRunner run(ServerRepo serverRepo) {
        log.info("running the command runner =====================>");
        return args -> {
            serverRepo.save(new Server(null,
                    "192.168.1.160",
                    "Ubuntu Linux",
                    "16 GB",
                    "Personal PC",
                    "http://localhost:8080/server/image/server1.png",
                    Status.SERVER_UP));

            serverRepo.save(new Server(null,
                    "192.168.1.160",
                    "Ubuntu Linux",
                    "16 GB",
                    "Personal PC",
                    "http://localhost:8080/server/image/server4.png",
                    Status.SERVER_UP));

            serverRepo.save(new Server(null,
                    "192.168.1.160",
                    "Ubuntu Linux",
                    "16 GB",
                    "Personal PC",
                    "http://localhost:8080/server/image/server2.png",
                    Status.SERVER_UP));

            serverRepo.save(new Server(null,
                    "192.108.1.160",
                    "Ubuntu Linux",
                    "16 GB",
                    "Personal PC",
                    "http://localhost:8080/server/image/server3.png",
                    Status.SERVER_UP));

        };
    }

}

package com.gaza.server.model;

import com.gaza.server.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;


@Entity
@Data
@Document(collection = "servers")
@NoArgsConstructor
@AllArgsConstructor
public class Server {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Column(unique = true, name = "IPAddress")
//    @Indexed(unique = true)
    @NotEmpty(message = "IP Address cannot be empty or null")
    private String IPAddress;
    private String name;
    private String memory;
    private String type;
    private String imageUrl;
    private Status status;

}

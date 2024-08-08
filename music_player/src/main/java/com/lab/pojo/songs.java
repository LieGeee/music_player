package com.lab.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class songs {
    private int songID;
    private String artist;
    private String title;
    private String url;
    private int songDurationInSeconds;

    // Constructors can be omitted with @NoArgsConstructor from Lombok

    // toString method for debugging can also be omitted with @ToString from Lombok
}

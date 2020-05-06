package org.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.*;

/**
 */
@Data
  /*  @ToString
    @Getter
    @Setter
    @RequiredArgsConstructor
    @EqualsAndHashCode*/
@NoArgsConstructor
@AllArgsConstructor
@Builder
//https://interviewbubble.com/lombok-cheatsheet
//https://interviewbubble.com/lombok-tutorials/
public class User {
    private String firstName;
    private String lastName;
    private String email;
}

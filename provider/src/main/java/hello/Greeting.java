package hello;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by luchenhua on 05/04/2017.
 */
@Data
@AllArgsConstructor
public class Greeting {

    private final long id;
    private final String content;
}

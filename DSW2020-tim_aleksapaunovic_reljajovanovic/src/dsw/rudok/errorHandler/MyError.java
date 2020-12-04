package dsw.rudok.errorHandler;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MyError {

    int type;
    String message;
    String title;

    public MyError(int type, String message, String title) {
        this.type = type;
        this.message = message;
        this.title = title;
    }
}

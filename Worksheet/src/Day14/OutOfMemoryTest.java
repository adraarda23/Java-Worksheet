package Day14;
import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryTest {

	public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        while (true) {
            list.add("This is an OutOfMemory error example.");
        }

	}

}

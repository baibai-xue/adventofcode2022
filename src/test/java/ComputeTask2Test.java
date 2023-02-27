import org.example.Main;
import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ComputeTask2Test {
    @Test
    public void tc01_compute_2_1_singleData() {
        Assert.assertEquals(4, Main.computeTask2("A X"));
    }

    @Test
    public void tc02_compute_2_1_simple() {
        Assert.assertEquals(15, Main.computeTask2("A Y\nB X\nC Z"));
    }

    @Test
    public void tc03_compute_2_1() throws IOException {
        Path fileName
                = Path.of("/Users/baibai/Programming/input2.txt");
        Assert.assertEquals(9241, Main.computeTask2(Files.readString(fileName)));
    }

    @Test
    public void tc04_compute_2_2_simple() {
        Assert.assertEquals(12, Main.computeTask2_2("A Y\nB X\nC Z"));
    }

    @Test
    public void tc05_compute_2_2() throws IOException {
        Path fileName
                = Path.of("/Users/baibai/Programming/input2_2.txt");
        Assert.assertEquals(14610, Main.computeTask2_2(Files.readString(fileName)));
    }
}

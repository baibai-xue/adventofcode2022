import org.example.Main;
import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ComputeTest {
    @Test
    public void tc01_compute_singleData(){
        Assert.assertEquals(1000,Main.computeTask1("1000"));
    }

    @Test
    public void tc02_compute_doubleData(){
        Assert.assertEquals(5000,Main.computeTask1("1000\n4000"));
    }
    @Test
    public void tc03_compute_twoElf_singleData(){
        Assert.assertEquals(8000,Main.computeTask1("1000\n4000\n \n8000"));
    }

    @Test
    public void tc04_compute_twoElf_multiData(){
        Assert.assertEquals(6000,Main.computeTask1("1000\n4000\n \n1000\n2000\n3000"));
    }

    @Test
    public void tc05_compute_twoElf_equal(){
        Assert.assertEquals(6000,Main.computeTask1("2000\n4000\n \n1000\n2000\n3000"));
    }

    @Test
    public void tc06_compute_mutliElf() throws IOException {
        Path fileName
                = Path.of("/Users/baibai/Programming/input.txt");
        Assert.assertEquals(67633,Main.computeTask1(Files.readString(fileName)));
    }

}

import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ComputeTask3Test {
    @Test
    public void tc01(){
        int result = Main.computeTask3("""
                vJrwpWtwJgWrhcsFMMfFFhFp
                jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
                PmmdzqPrVvPwwTWBwg
                wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
                ttgJtRGJQctTZtZT
                CrZsJsPPZsGzwwsLwLmpwMDw""");
        Assert.assertEquals(157,result);
    }

    @Test
    public void tc02() throws IOException {

        Path fileName
                = Path.of("/Users/baibai/Programming/input3.txt");

        Assert.assertEquals(7850,Main.computeTask3(Files.readString(fileName)));
    }

    @Test
    public void tc03() {

        int result = Main.computeTask3_2("""
                vJrwpWtwJgWrhcsFMMfFFhFp
                jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
                PmmdzqPrVvPwwTWBwg
                wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
                ttgJtRGJQctTZtZT
                CrZsJsPPZsGzwwsLwLmpwMDw""");
        Assert.assertEquals(70,result);

    }

    @Test
    public void tc04() throws IOException {

        Path fileName
                = Path.of("/Users/baibai/Programming/input3_2.txt");
        
        Assert.assertEquals(2581,Main.computeTask3_2(Files.readString(fileName)));

    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) throws FileNotFoundException {

        String inputPath = "/Users/will/day1input.txt";

        SonarSweeper run = new SonarSweeper(inputPath);
        System.out.println(run.part2Depths());

    }

    static class SonarSweeper {
        private final ArrayList<Integer> inputValues = new ArrayList<Integer>();
        public int increases = 0;

        SonarSweeper(String inputPath) throws FileNotFoundException {
            Scanner fileReader = new Scanner(new File(inputPath));
            while (fileReader.hasNextLine()) inputValues.add(Integer.parseInt(fileReader.nextLine()));
            System.out.println(inputValues);
        }

        public int part1Depths() {
            for (int i = 0; i < inputValues.size() - 1; i++) {
                if (inputValues.get(i) < inputValues.get(i + 1)) increases++;
            }
            return increases;
        }

        public int part2Depths(){
            for (int i = 1; i < inputValues.size() - 2; i++){
                if (inputValues.get(i) + inputValues.get(i + 1) + inputValues.get(i + 2) > inputValues.get(i-1) + inputValues.get(i) + inputValues.get(i + 1)) increases++;

            }
            return increases;
        }

    }

}

    /*import input file
    for each number check whether it is bigger than the number before
    if it is then increment counter by one
    output final number
     */




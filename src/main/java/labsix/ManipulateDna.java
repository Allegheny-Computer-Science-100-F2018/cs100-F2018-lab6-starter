package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class ManipulateDna {

  public static void main(String[] args) {
    // TODO: display the name of the programmer and the date

    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // TODO: Step One: Read in and display the chosen DNA string

    // TODO: Step Two: Compute the complement of the DNA String

    // TODO: Step Three: Insert a randomly chosen DNA letter into the DNA String

    // TODO: Step Four: Delete a DNA letter from a randomly chosen position in the DNA string

    // TODO: Step Five: Change a random position in the DNA String to a randomly chosen DNA letter

    // TODO: Step Six: Display a final thank-you message

  }

}

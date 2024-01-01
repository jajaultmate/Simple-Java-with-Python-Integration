import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class call_python_file {
    public static void main(String[] args) {
        try {
            String pythonInterpreter = "python3";

            String pythonscriptpath = "C:\\Users\\PC\\PycharmProjects\\pythonProject\\Integration with Java\\simple_print.py";

            Process process = Runtime.getRuntime().exec(pythonInterpreter + " " + pythonscriptpath);

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("The output of the Python file is: " + line);
            }
            int exitCode = process.waitFor();
            System.out.println("The python code exited with the code: " + exitCode);
        }
        catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

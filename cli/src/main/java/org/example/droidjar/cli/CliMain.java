package org.example.droidjar.cli;

import org.example.droidjar.lib.DroidJarLib;

import java.util.concurrent.Callable;

import picocli.CommandLine;

@CommandLine.Command(
        description = "Counts the number of unique characters of the first command line argument",
        name = "droidjar",
        mixinStandardHelpOptions = true,
        version = "0.1"
)
public class CliMain implements Callable<Integer> {

    @CommandLine.Parameters(
            description = "The string that is to be counted",
            defaultValue = ""
    )
    private String text;

    private final DroidJarLib lib = new DroidJarLib();

    public static void main(final String[] args) {
        final int exitCode = new CommandLine(new CliMain()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() {
        int uniqueChars = lib.countUniqueCharacters(text);
        System.out.printf("Unique characters: %d%n", uniqueChars);
        return 0;
    }
}

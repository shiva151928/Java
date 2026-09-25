import java.io.File;
import java.util.List;
import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class CompilerService {

    public static boolean compile(File sourceFile, File outputDirectory) throws Exception {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

        if (compiler == null) {
            throw new IllegalStateException("JDK not found. Start the IDE with a JDK.");
        }

        try (StandardJavaFileManager fileManager =
                     compiler.getStandardFileManager(null, null, null)) {

            var sources = fileManager.getJavaFileObjects(sourceFile);

            List<String> options = List.of(
                "-d", outputDirectory.getAbsolutePath()
            );

            return compiler.getTask(
                null,
                fileManager,
                null,
                options,
                null,
                sources
            ).call();
        }
    }
}

boolean success = CompilerService.compile(
    new File("/project/src/Hello.java"),
    new File("/project/out")
);

System.out.println(success ? "Compiled" : "Compilation failed");

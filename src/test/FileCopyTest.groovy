package test;
import org.junit.Test
import photorganizer.PhotoCopy

/**
 * Created by Вадик on 07.01.2016.
 */
class FileCopyTest extends GroovyTestCase {
   @Test
    void testAssertions() {
        File testSource = new File("g://Test/source.txt");
       testSource.append("sfsd");
     //  testSource.createNewFile();
        File fileTarget = new File("g://Test/target.txt");
        PhotoCopy.copy(testSource, fileTarget);
        assert(fileTarget.exists());

    }
}

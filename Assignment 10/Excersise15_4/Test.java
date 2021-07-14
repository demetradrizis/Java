public class Test
{
    public static void main(String[] args) 
    {
        FileMatch test = new FileMatch();
         
        test.openFiles();
        test.processFiles(); 
        test.closeFiles();
    }
}

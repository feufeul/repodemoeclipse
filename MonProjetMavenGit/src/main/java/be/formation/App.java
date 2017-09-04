package be.formation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        showLoggingFrameworks();
        showPoolingFrameworks();
    }

	private static void showPoolingFrameworks() {
		System.out.println("===== HickariCP =====");
		System.out.println("===== C3P0 =====");
		
	}

	private static void showLoggingFrameworks() {
		System.out.println("====== LOG4J =======");
		System.out.println("===== SLF4J Facade =====");
		}
}

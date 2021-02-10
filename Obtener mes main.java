import es.ulpgc.eii.strings.StringUtils;

public class Main {
    /**
     * Prueba el método StringUtils.dates
     * @param input - ristra de búsqueda
     * @param expected - resultado esperado
     */
    static void test(String input, String expected) {
    	// Se informa del caso que se está probando
    	System.out.println("probando: mes(\"" + input + "\")");
    	
        // Llamada al método a probar
        String result = StringUtils.mes(input);
        
        // Comprobación de los resultados
        if (!result.equals(expected)) {
            System.out.print(">> Resultado erróneo, deberia ser: \"" + expected + "\"");
            System.out.println(" y es: \"" + result + "\"");
        } else {
            System.out.println(">> Resultado correcto: \"" + result + "\"");
        }        
    }

    /**
     * @param args
     */
    /**
     * Invoca a test para realizar múltiples pruebas de StringUtils.dates
     * @param args
     */
    public static void main(String[] args) {
        test("1-enero-1999", "enero");
    }

}

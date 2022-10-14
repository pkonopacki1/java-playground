public class SwitchPlayground {


    public static void main(String[] args) {
        switchStatement();
        switchExpression();
        System.out.println(switchExpressionReturningValue());     
    }


    // Swithch expression introduced in JDK 13
    private static void switchExpression() {
        String name = "Machine Head";

        switch (name) {
            case "Linkin Park" -> System.out.println("Not heavy");
            case "Machine Head" ->  System.out.println("Heavy");
            case "Gojira" -> System.out.println("Heavy as fuck");
            default -> System.err.println("Band not found");
        }
    }

    private static String switchExpressionReturningValue() {
        String name = "Green day";

        var heaviness = switch (name) {
            case "Linkin Park" -> "Not heavy";
            case "Machine Head" -> "Heavy";
            case "Gojira" -> "Heavy as fuck";
            default -> "Band not found";
        };

        return heaviness;
    }

    private static void switchStatement() {
        String name = "Gojira";
        switch (name) {
            case "Linkin Park":
                System.out.println("Not heavy");
                break;
            case "Machine Head":
                System.out.println("Heavy");
                break;
            case "Gojira":
                System.out.println("Heavy as fuck");
            default:
                break;
        }
    }
    
}

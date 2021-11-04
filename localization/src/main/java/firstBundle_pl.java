import java.util.ListResourceBundle;

public class firstBundle_pl extends ListResourceBundle{

    @Override
    protected Object[][] getContents() {
        return new Object[][] {
            {"yes", "jak najbardziej"},
            {"no", "absoulutnie nie!"},
            {"thank_you", "dzięki!"}
        };
    }

    
}

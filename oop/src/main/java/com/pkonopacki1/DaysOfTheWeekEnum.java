package com.pkonopacki1;

interface EnumInterface {
    void enumMethod();
}

// Enum can't extend class but it can implement an interface
public enum DaysOfTheWeekEnum implements EnumInterface {
    MONDAY("mond", "Start of the week"),
    TUESDAY("tue"), 
    //Below we can see that these objects behave like anonymous classes, and we can e.g. implement custom method
    WEDNESDAY("wed", "Middle of the week") {
        @Override
        String doSomethingEnum() {
            return "Enum custom method";
        }
    },
    THURSDAY("thur"), 
    FRIDAY("fri", "End of the week"), 
    SATURDAY("sat","Weekend starts"),
    SUNDAY("sun", "weekend ends");

    String abr;
    String comment;

    DaysOfTheWeekEnum(String abr, String comment) {
        this.abr = abr;
        this.comment = comment;
        System.out.println("Enum constructor");
    }

    DaysOfTheWeekEnum(String abr) {
        this.abr = abr;
    }

    String doSomethingEnum() {
        return "Enum standard method";
    }

    @Override
    public void enumMethod() {
        // TODO Auto-generated method stub
        
    }

       
    
}

class EnumTest {
    public static void main(String[] args) {
        // for(DaysOfTheWeekEnum day: DaysOfTheWeekEnum.values()) {
        //     System.out.println(day + ": " + day.abr + ": " + day.comment + ": " + day.doSomethingEnum());
        // }

        DaysOfTheWeekEnum daysOfTheWeekEnum = DaysOfTheWeekEnum.MONDAY;
    }
}

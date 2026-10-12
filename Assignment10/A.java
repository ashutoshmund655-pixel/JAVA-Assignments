class Bank {
    double rateofintrest;

    void getrateofintrest() {
        System.out.println("Display the rate of interest");
    }
}

class SBI extends Bank {
    void getrateofintrest() {
        System.out.println("Rate of Interest SBI: " +rateofintrest );
    }
}

class ICICI extends Bank {
    void getrateofintrest() {
        System.out.println("Rate of Interest ICICI: " +rateofintrest);
    }
}

class Axis extends Bank {
    void getrateofintrest() {
        System.out.println("Rate of Interest AXIS: " +rateofintrest);
    }
}

class A {
    public static void main(String args[]) {

        SBI s = new SBI();
        s.rateofintrest = 8.4;
        s.getrateofintrest();

        ICICI i = new ICICI();
        i.rateofintrest = 7.3;
        i.getrateofintrest();

        Axis a = new Axis();
        a.rateofintrest = 9.7;
        a.getrateofintrest();
    }
}
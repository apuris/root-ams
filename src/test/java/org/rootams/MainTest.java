package org.rootams;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main() {


        Main.MAX_RUNS = 5;
        Main.SEED = 1;
        Main.MAX_CHANGES = 50;
        Main.CHANGE_FREQUENCY = 2500;
        Main.CHANGE_TYPE = 1;
        Main.FUTURE_HORIZON = 2;
        Main.ALGORITHM_ID = 1;
        Main.POPULATION_SIZE = 50;
        Main.OUTPUT_FILE = "test.out";

        Main.main(null);

    }

    @Test
    public void mainJin() {


        Main.MAX_RUNS = 1;
        Main.SEED = 1;
        Main.MAX_CHANGES = 23;
        Main.CHANGE_FREQUENCY = 2500;
        Main.CHANGE_TYPE = 1;
        Main.FUTURE_HORIZON = 2;
        Main.ALGORITHM_ID = 2;
        Main.POPULATION_SIZE = 50;
        Main.OUTPUT_FILE = "test_jin.out";

        Main.main(null);



    }
}
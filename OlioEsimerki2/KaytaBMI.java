/**
 * @(#)KaytaBMI.java
 *
 * Testataan BMI-luokan toimintaa
 *
 * @author
 * @version 1.00 2019/6/14
 */


public class KaytaBMI {

    public static void main(String[] args) {
    	BMI bmi1 = new BMI("Matti Meikäläinen", 18, 70, 1.80);
    	System.out.println("BMI henkilölle " + bmi1.palautaNimi() +
    		" on " + bmi1.palautaBMI() + " " + bmi1.palautaTila());

    	BMI bmi2 = new BMI("Liisa Meikäläinen", 55, 1.80);
    	System.out.println("BMI henkilölle " + bmi2.palautaNimi() +
    		" on " + bmi2.palautaBMI() + " " + bmi2.palautaTila());
    }


}
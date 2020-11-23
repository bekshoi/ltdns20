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
    	BMI bmi1 = new BMI("Matti Meik�l�inen", 18, 70, 1.80);
    	System.out.println("BMI henkil�lle " + bmi1.palautaNimi() +
    		" on " + bmi1.palautaBMI() + " " + bmi1.palautaTila());

    	BMI bmi2 = new BMI("Liisa Meik�l�inen", 55, 1.80);
    	System.out.println("BMI henkil�lle " + bmi2.palautaNimi() +
    		" on " + bmi2.palautaBMI() + " " + bmi2.palautaTila());
    }


}

public class Makeup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Branding b = new Branding("Fenty Beauty", "Maybelline", "MAC", "Revlon");
        HowToUse h = new HowToUse();
        WhereToBuy w = new WhereToBuy();
		b.setMakeup("Lipstick ", "Eyeshadow ", "Mascara ", "Blusher ");
        
        //LIPSTICK
        System.out.println("Type of Makeup: " + b.getLipstick());
        System.out.println("Brand that this type have: ");
        System.out.println(b.getBrand1());
        System.out.println(b.getBrand2());
        System.out.println(b.getBrand3());
        System.out.println(b.getBrand4());
        System.out.println("");
        h.UseLipstick(); //POLYMORPHISM
        System.out.println("");
        w.WhereToBuy(); //ABSTRACTION
        w.location();
        System.out.println("---------------------------------");
        
        //EYESHADOW
        System.out.println("Type of Makeup: " + b.getEyeshadow());
        System.out.println("Brand that this type have: ");
        System.out.println(b.getBrand1());
        System.out.println(b.getBrand2());
        System.out.println(b.getBrand3());
        System.out.println(b.getBrand4());
        System.out.println("");
        h.UseEyeshadow(); //POLYMORPHISM
        System.out.println("");
        w.WhereToBuy(); //ABSTRACTION
        w.location();
        System.out.println("---------------------------------");
        
        //MASCARA
        System.out.println("Type of Makeup: " + b.getMascara());
        System.out.println("Brand that this type have: ");
        System.out.println(b.getBrand1());
        System.out.println(b.getBrand2());
        System.out.println(b.getBrand3());
        System.out.println(b.getBrand4());
        System.out.println("");
        h.UseMascara(); //POLYMORPHISM
        System.out.println("");
        w.WhereToBuy(); //ABSTRACTION
        w.location();
        System.out.println("---------------------------------");
        
        System.out.println("Type of Makeup: " + b.getBlusher());
        System.out.println("Brand that this type have: ");
        System.out.println(b.getBrand1());
        System.out.println(b.getBrand2());
        System.out.println(b.getBrand3());
        System.out.println(b.getBrand4());
        System.out.println("");
        h.UseBlusher(); //POLYMORPHISM
        System.out.println("");
        w.WhereToBuy(); //ABSTRACTION
        w.location();
        
	}

}
